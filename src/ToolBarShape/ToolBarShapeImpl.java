package ToolBarShape;
import PubSub.Message;
import PubSub.PubSubService;
import PubSub.Publisher.Publisher;
import PubSub.Publisher.PublisherImpl;
import ToolBarShape.Interfaces.ToolBarShape;
import ToolBarShape.Interfaces.ToolBarShapePublisher;

public class ToolBarShapeImpl implements ToolBarShape, ToolBarShapePublisher{
    private Publisher publisher;
    private PubSubService pubSubService;

    public ToolBarShapeImpl(PubSubService pubSubService){
        this.pubSubService = pubSubService;
        becomePublisher(pubSubService);
    }
    public void createShape(String type){
        System.out.println("Publicando mensaje desde la ToolBarShape");
        Message shapeMessage = new Message("Create shape",type);
        publisher.emit(shapeMessage, pubSubService);
    }
    public void becomePublisher(PubSubService pubSubService){
        publisher = new PublisherImpl(); 
        this.pubSubService = pubSubService;  
    }
}
