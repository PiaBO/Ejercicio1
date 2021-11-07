package Canvas.Interfaces;
import PubSub.Message;

public interface CanvasMessagesControl {
    public void checkMessages();
    public void commands(Message message);
}
