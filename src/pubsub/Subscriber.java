package pubsub;
import java.util.ArrayList;
import java.util.List;

public abstract class Subscriber {
    private List<Message> subscriberMessages = new ArrayList<>();
    public List<Message> getSubscriberMessages(){
        return subscriberMessages;
    }
    public void setSubscriberMessages(List<Message> subscriberMessages) {
		this.subscriberMessages = subscriberMessages;
	}
    public abstract void subscribe(String message, PubSubService pubSubService);
    public abstract void unsubscribe(String message, PubSubService pubSubService);
}
