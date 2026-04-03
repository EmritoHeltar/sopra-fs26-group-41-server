package ch.uzh.ifi.hase.soprafs26.service;

import ch.uzh.ifi.hase.soprafs26.entity.Group;
import ch.uzh.ifi.hase.soprafs26.entity.User;
import ch.uzh.ifi.hase.soprafs26.repository.GroupRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@Transactional
public class GroupService {

    private final Logger log = LoggerFactory.getLogger(GroupService.class);
    private final GroupRepository groupRepository;

    @Autowired
    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public Group joinGroupByToken(String joinToken, User user) {
        log.debug("Attempting to join group with token: {} for user: {}", joinToken, user.getUsername());
        
        Group group = groupRepository.findByJoinToken(joinToken);
        
        if (group == null) {
            log.error("Failed to join group. Invalid join token: {}", joinToken);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid join token");
        }

        if (group.getMembers() != null && group.getMembers().contains(user)) {
            log.warn("User {} attempted to join group {} but is already a member.", user.getUsername(), group.getGroupName());
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "User is already a member. Group URL: " + group.getInviteLink());
        }

        // Add user to the group
        group.addMember(user);
        log.info("Successfully added user {} to group {}", user.getUsername(), group.getGroupName());
        
        // Save and return the updated group
        return groupRepository.save(group);
    }
}