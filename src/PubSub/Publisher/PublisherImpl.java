package PubSub.Publisher;
import PubSub.*;


public class PublisherImpl implements Publisher{
    public void emit(Message message, PubSubService pubSubService){
        pubSubService.queueMessage(message);
    }  
}
