package Implementation;
import Abstraction.ToolBarColors;
import Abstraction.ColorPublisher;
import Abstraction.Publisher;

public class ToolBarColorsImpl implements ToolBarColors, ColorPublisher{
    private String borderColor;
    private String fillColor;
    private Publisher publisher;
    private PubSubService pubSubService;
    
    public ToolBarColorsImpl(){
        borderColor = "Negro";
        fillColor = "Blanco";
    }
    public void becomePublisher(PubSubService pubSubService){
        this.pubSubService = pubSubService;
        publisher = new PublisherImpl();
    }
    public void selectColor(String color){
        Message colorMessage = new Message("Color",color);
        publisher.emit(colorMessage, pubSubService);
    }

}
