package Implementation;

import Abstraction.Publisher;

public class PublisherImpl implements Publisher{
	public void addSubscriber(String channel,  Subscriber subscriber){
		pubSubService.addSubscriber(channel, subscriber);
	}
	public void unSubscribe(String channel, Subscriber subscriber){
		pubSubService.removeSubscriber(channel, subscriber);
	}
    public void emit(Message message, PubSubService pubSubService){
        pubSubService.queueMessage(message);
    }  
}
