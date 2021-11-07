package Abstraction;
import java.util.ArrayList;
import java.util.List;
import Implementation.Message;
import Implementation.PubSubService;

public abstract class Subscriber {
    private List<Message> subscriberMessages = new ArrayList<>();
    public List<Message> getSubscriberMessages(){
        return subscriberMessages;
    }
    public void setSubscriberMessages(List<Message> subscriberMessages) {
		this.subscriberMessages = subscriberMessages;
	}
    public abstract void subscribe(String channel, PubSubService pubSubService);
    public abstract void unsubscribe();
}
