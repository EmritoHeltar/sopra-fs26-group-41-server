package ch.uzh.ifi.hase.soprafs26.controller;

import ch.uzh.ifi.hase.soprafs26.entity.Group;
import ch.uzh.ifi.hase.soprafs26.rest.dto.GroupJoinResponseDTO;
import ch.uzh.ifi.hase.soprafs26.service.GroupService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import ch.uzh.ifi.hase.soprafs26.entity.User;
import ch.uzh.ifi.hase.soprafs26.service.UserService;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class GroupController {

    private final UserService userService;
    private final GroupService groupService;

    GroupController(UserService userService, GroupService groupService) {
        this.userService = userService;
        this.groupService = groupService;
    }

    @PostMapping("/groups/join/{joinToken}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public GroupJoinResponseDTO joinGroup(
            @PathVariable String joinToken,
            @RequestHeader(value = "Authorization", required = true) String authorization) {

        String token = AuthenticationController.getAuthorizationToken(authorization);

        if (!userService.authenticated(token)) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "You need to be logged in to do this");
        }
        User user = userService.getUserByToken(token);

        Group joinedGroup = groupService.joinGroupByToken(joinToken, user);

        GroupJoinResponseDTO response = new GroupJoinResponseDTO();
        response.setGroupUrl(joinedGroup.getInviteLink());

        return response;
    }
}
