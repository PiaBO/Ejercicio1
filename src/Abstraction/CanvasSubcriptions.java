package Abstraction;
import Implementation.Message;
import Implementation.PubSubService;

public interface CanvasSubcriptions {
    public void subscribe(String channel,PubSubService pubSubService);
    public void unsubscribe(String channel);
    public void checkMessages();
    public void commands(Message message);
}
