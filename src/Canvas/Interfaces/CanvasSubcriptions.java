package Canvas.Interfaces;
import PubSub.Message;

public interface CanvasSubcriptions {
    public void subscribe(String channel);
    public void unsubscribe(String channel);
    public void checkMessages();
    public void commands(Message message);
}
