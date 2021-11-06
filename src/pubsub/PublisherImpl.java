package pubsub;

public class PublisherImpl implements Publisher{
    public void emit(Message message, PubSubService pubSubService){
        pubSubService.queueMessage(message);
    }

    
}
