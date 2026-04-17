package ch.uzh.ifi.hase.soprafs26.websocket;

import java.security.Principal;

public class WebsocketPrincipal implements Principal {
    private final String name;

    public WebsocketPrincipal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}