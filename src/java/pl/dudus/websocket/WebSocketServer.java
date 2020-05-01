package pl.dudus.websocket;

import java.util.Timer;
import java.util.TimerTask;
import javax.enterprise.context.ApplicationScoped;
import javax.json.JsonObject;
import javax.json.spi.JsonProvider;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ApplicationScoped
@ServerEndpoint("/data")
public class WebSocketServer {
    private SessionHandler sessionHandler = new SessionHandler();
    JsonProvider provider = JsonProvider.provider();
    Timer timer = new Timer(true);
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            JsonObject chartDataMessage = provider.createObjectBuilder()
                .add("chartData", 
                    provider.createArrayBuilder()
                        .add(randomNumber())
                        .add(randomNumber())
                )
                .build();
            sessionHandler.sendToAllConnectedSessions(chartDataMessage);
        }
    };
    
    public WebSocketServer() {
        timer.scheduleAtFixedRate(timerTask, 0, 500);
    }
    
    @OnOpen
    public void open(Session session) {
        sessionHandler.addSession(session);
    }

    @OnClose
    public void close(Session session) {
        sessionHandler.removeSession(session);
    }

    @OnError
    public void onError(Throwable error) {
    }

    @OnMessage
    public void handleMessage(String message, Session session) {
        
    }

    private int randomNumber() {
        return (int)(Math.random() * 50 + 5);
    }
    
}
