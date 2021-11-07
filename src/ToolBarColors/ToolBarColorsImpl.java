package ToolBarColors;
import Data.Channels;
import PubSub.Message;
import PubSub.PubSubService;
import PubSub.Publisher.Publisher;
import PubSub.Publisher.PublisherImpl;
import ToolBarColors.Inerfaces.ColorPublisher;
import ToolBarColors.Inerfaces.ToolBarColors;

public class ToolBarColorsImpl implements ToolBarColors, ColorPublisher{
    private String borderColor;
    private String fillColor;
    private Publisher publisher;
    private PubSubService pubSubService;
    
    public ToolBarColorsImpl(PubSubService pubSubService){
        borderColor = "Negro";
        fillColor = "Blanco";
        this.pubSubService = pubSubService;
        becomePublisher(pubSubService);
    }
    public void becomePublisher(PubSubService pubSubService){
        publisher = new PublisherImpl(); 
        this.pubSubService = pubSubService;  
    }
    public void selectFillColor(String color){
        this.fillColor = color;
        Message colorMessage = new Message(Channels.FILL_COLOR,fillColor);
        publisher.emit(colorMessage, pubSubService);
    }
    public void selectBorderColor(String color) {
        this.borderColor = color;
        Message colorMessage = new Message(Channels.BORDER_COLOR,borderColor);
        publisher.emit(colorMessage, pubSubService);
    }
    public String getBorderColor(){
        return borderColor;
    }
    public String getFillColor(){
        return fillColor;
    }
}
