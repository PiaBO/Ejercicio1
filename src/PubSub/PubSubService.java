package PubSub;
import PubSub.Subscriber.Subscriber;

public interface PubSubService {
    public void queueMessage(Message message);
    public void addSubscriber(String channel, Subscriber subscriber);
    public void removeSubscriber(String channel, Subscriber subscriber);
    public void emit();
    public void getMessagesForSubsOfChannel(String channel, Subscriber subscriber);
}
