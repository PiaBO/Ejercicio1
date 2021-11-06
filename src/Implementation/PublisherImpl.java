package Implementation;

import Abstraction.Publisher;

public class PublisherImpl implements Publisher{
    public void emit(Message message, PubSubService pubSubService){
        pubSubService.queueMessage(message);
    }  
}
