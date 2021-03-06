package communication.clientmessagehandlers;

import com.google.gson.Gson;

public interface IMessageHandler {
    void handleMessage(String message, String sessionId, Gson gson);
}
