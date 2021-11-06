package pubsub;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class PubSubService {
    Map<String, Set<Subscriber>> subscribersChannels = new HashMap<String, Set<Subscriber>>();
    Queue<Message> messagesQueue = new LinkedList<Message>();
    public void queueMessage(Message message){
        messagesQueue.add(message);
    }
    public void addSubscriber(String channel, Subscriber subscriber){
        if(subscribersChannels.containsKey(channel)){
            Set<Subscriber> subscribers = subscribersChannels.get(channel);
            subscribers.add(subscriber);
            subscribersChannels.put(channel, subscribers);
        }else{
            Set<Subscriber> subscribers = new HashSet<Subscriber>();
            subscribers.add(subscriber);
            subscribersChannels.put(channel, subscribers);
        }
    }
    public void removeSubscriber(String channel, Subscriber subscriber){
		if(subscribersChannels.containsKey(channel)){
			Set<Subscriber> subscribers = subscribersChannels.get(channel);
			subscribers.remove(subscriber);
			subscribersChannels.put(channel, subscribers);
		}
    }
    public void emit(){
        while(!messagesQueue.isEmpty()){
            Message message = messagesQueue.remove();
            String channel = message.getChannel();
            Set<Subscriber> subscribersOfChannel = subscribersChannels.get(channel);
            for(Subscriber subscriber : subscribersOfChannel){
                List<Message> subscriberMessages = subscriber.getSubscriberMessages();
                subscriberMessages.add(message);
                subscriber.setSubscriberMessages(subscriberMessages);
            }			
        }
	}
    public void getMessagesForSubsOfChannel(String channel, Subscriber subscriber){
        while(!messagesQueue.isEmpty()){
            Message message = messagesQueue.remove();
            if(message.getChannel().equalsIgnoreCase(channel)){
                Set<Subscriber> subscribersOfChannel = subscribersChannels.get(channel);
                for(Subscriber sub : subscribersOfChannel){
                    if(sub.equals(subscriber)){
                        List<Message> subscriberMessages = subscriber.getSubscriberMessages();
                        subscriberMessages.add(message);
                        subscriber.setSubscriberMessages(subscriberMessages);
                    }
                }
            }   
        }     
    }
}
