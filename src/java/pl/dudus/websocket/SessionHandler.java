package pl.dudus.websocket;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.enterprise.context.ApplicationScoped;
import javax.json.JsonObject;
import javax.websocket.Session;

@ApplicationScoped
public class SessionHandler {
    private final Set<Session> sessions = new HashSet<>();
    
    public void addSession(Session session) {
        sessions.add(session);
    }

    public void removeSession(Session session) {
        sessions.remove(session);
    }
    
    public void sendToAllConnectedSessions(JsonObject message) {
        sessions.stream().forEach((session) -> {
            sendToSession(session, message);
        });
    }
    
    private void sendToSession(Session session, JsonObject message) {
        try {
            session.getBasicRemote().sendText(message.toString());
        } catch (IOException ex) {
            sessions.remove(session);
        }
    }
}
