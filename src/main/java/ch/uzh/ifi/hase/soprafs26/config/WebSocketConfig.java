package ch.uzh.ifi.hase.soprafs26.config;

import ch.uzh.ifi.hase.soprafs26.websocket.AuthHandshakeInterceptor;
import ch.uzh.ifi.hase.soprafs26.websocket.AppWebSocketHandler;
import ch.uzh.ifi.hase.soprafs26.websocket.UserHandshakeHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    private final AuthHandshakeInterceptor authHandshakeInterceptor;
    private final AppWebSocketHandler appWebSocketHandler;

    public WebSocketConfig(AuthHandshakeInterceptor authHandshakeInterceptor,
                           AppWebSocketHandler appWebSocketHandler) {
        this.authHandshakeInterceptor = authHandshakeInterceptor;
        this.appWebSocketHandler = appWebSocketHandler;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(appWebSocketHandler, "/ws")
                .addInterceptors(authHandshakeInterceptor)
                .setHandshakeHandler(new UserHandshakeHandler())
                .setAllowedOriginPatterns("*");
    }
}