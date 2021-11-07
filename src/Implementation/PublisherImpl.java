package Implementation;
import Abstraction.Publisher;
import Abstraction.Subscriber;


public class PublisherImpl implements Publisher{
    public void emit(Message message, PubSubService pubSubService){
        pubSubService.queueMessage(message);
    }  
}
