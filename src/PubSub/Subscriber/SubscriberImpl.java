package PubSub.Subscriber;
import PubSub.PubSubService;

public class SubscriberImpl extends Subscriber{
    Runnable unsubscribe;
    public void subscribe(String channel, PubSubService pubSubService){
        pubSubService.addSubscriber(channel, this);
        unsubscribe = ()->{pubSubService.removeSubscriber(channel, this);};
    }
    public void unsubscribe(){
        unsubscribe.run();
    }
}
