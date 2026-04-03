package ch.uzh.ifi.hase.soprafs26.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ch.uzh.ifi.hase.soprafs26.entity.Group; // Ensure Group is imported

@Repository("groupRepository")
public interface GroupRepository extends JpaRepository<Group, Long> {

    Group findByJoinToken(String joinToken);
}