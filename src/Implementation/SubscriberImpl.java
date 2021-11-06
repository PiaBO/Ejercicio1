package Implementation;
import Abstraction.Subscriber;

public class SubscriberImpl extends Subscriber{
    public void subscribe(String message, PubSubService pubSubService){
        pubSubService.addSubscriber(message, this);
    }
    public void unsubscribe(String message, PubSubService pubSubService){
        pubSubService.removeSubscriber(message, this);
    }
}
