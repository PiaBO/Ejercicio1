package Implementation;

import Abstraction.Publisher;
import Abstraction.Shape;
import Abstraction.ShapeFactory;
import Abstraction.ShapePublisher;
import Abstraction.ToolBarShape;

public class ToolBarShapeImpl implements ToolBarShape, ShapePublisher{
    private Publisher publisher;
    private ShapeFactory factory;
    private PubSubService pubSubService;

    public void createShape(String type){
        Message shapeMessage = new Message("Create shape",type);
        publisher.emit(shapeMessage, pubSubService);
    }
    public void becomePublisher(PubSubService pubSubService){
        publisher = new PublisherImpl(); 
        this.pubSubService = pubSubService;  
    }
}
