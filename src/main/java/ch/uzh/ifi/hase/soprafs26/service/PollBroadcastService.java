package ch.uzh.ifi.hase.soprafs26.service;

import ch.uzh.ifi.hase.soprafs26.entity.Group;
import ch.uzh.ifi.hase.soprafs26.entity.User;
import ch.uzh.ifi.hase.soprafs26.websocket.AppWebSocketHandler;
import org.springframework.stereotype.Service;

@Service
public class PollBroadcastService {

    private final AppWebSocketHandler webSocketHandler;

    public PollBroadcastService(AppWebSocketHandler webSocketHandler) {
        this.webSocketHandler = webSocketHandler;
    }

    public void broadcastPollStarted(Group group) {
        if (group.getMembers() == null) {
            return;
        }

        String payload = buildPollStartedPayload(group.getId());

        for (User member : group.getMembers()) {
            webSocketHandler.sendToUser(member.getUsername(), payload);
        }
    }

    private String buildPollStartedPayload(Long groupId) {
        return "{"
                + "\"type\":\"poll\","
                + "\"event\":\"started\","
                + "\"groupId\":" + groupId + ","
                + "\"message\":\"A new poll has started for this group.\","
                + "\"url\":\"/groups/" + groupId + "/poll\""
                + "}";
    }
}