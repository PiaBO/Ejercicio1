package PubSub.Subscriber;
import java.util.ArrayList;
import java.util.List;
import PubSub.Message;
import PubSub.PubSubService;

public class SubscriberImpl implements Subscriber{
    Runnable unsubscribe;
    private List<Message> subscriberMessages = new ArrayList<>();
    public List<Message> getSubscriberMessages(){
        return subscriberMessages;
    }
    public void setSubscriberMessages(List<Message> subscriberMessages) {
		this.subscriberMessages = subscriberMessages;
	}
    public void subscribe(String channel, PubSubService pubSubService){
        pubSubService.addSubscriber(channel, this);
        unsubscribe = ()->{pubSubService.removeSubscriber(channel, this);};
    }
    public void unsubscribe(){
        unsubscribe.run();
    }
}
