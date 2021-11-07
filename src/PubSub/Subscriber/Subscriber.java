package PubSub.Subscriber;
import java.util.ArrayList;
import java.util.List;
import PubSub.*;

public interface Subscriber {
    public List<Message> getSubscriberMessages();
    public void setSubscriberMessages(List<Message> subscriberMessages);
    public abstract void subscribe(String channel, PubSubService pubSubService);
    public abstract void unsubscribe();
}
