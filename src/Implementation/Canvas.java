package Implementation;
import java.util.ArrayList;
import java.util.List;
import Abstraction.CanvasAdd;
import Abstraction.CanvasPointer;
import Abstraction.CanvasRender;
import Abstraction.CanvasSubcriptions;
import Abstraction.Shape;
import Abstraction.ShapeFactory;
import Abstraction.Subscriber;
import Data.Channels;
import Data.ShapeTypes;

public class Canvas implements CanvasAdd, CanvasPointer, CanvasRender, CanvasSubcriptions{
    private ArrayList<Shape> shapes;
    private Shape selected;
    private ArrayList<Subscriber> subscriptions;
    private PubSubService pubSubService;

    public Canvas(PubSubService pubSubService){
        shapes = new ArrayList<>();
        subscriptions = new ArrayList<>();
        this.pubSubService = pubSubService;
    }
    public void addShape(Shape shape){
        shapes.add(shape);
        selected = shape;
    }
    public void selectShape(float x, float y){
        for (Shape shape : shapes){
            if(x > shape.getX() && x < shape.getWidth() && y > shape.getY() && y < shape.getHeight()){
                selected = shape;
            }
        }
    }
    public void render(){
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
    public void subscribe(String channel){
        Subscriber subscriber = new SubscriberImpl();
        subscriptions.add(subscriber);
        pubSubService.addSubscriber(channel, subscriber);
    }
    public void unsubscribe(String channel){
        for (Subscriber subscriber : subscriptions) {
            for (Message message : subscriber.getSubscriberMessages()) {
                if(message.getChannel().equals(channel)){
                    subscriber.unsubscribe();
                    subscriptions.remove(subscriber);
                }
            }
        }
    }
    public void checkMessages(){
        for (Subscriber subscriber : subscriptions) {
            List<Message> messages = subscriber.getSubscriberMessages();
            for (Message message : messages) {
                commands(message);
            }
        }  
    }
    public void commands(Message message){
        if(message.getChannel().equals(Channels.FILL_COLOR)){
            selected.setFillColor(message.getMessage());
        }else if(message.getChannel().equals(Channels.FILL_COLOR)){
            selected.setBorderColor(message.getMessage());
        }else if(message.getChannel().equals(Channels.FILL_COLOR)){
            ShapeFactory factory = new ShapeFactoryImpl();
            factory.createShape(ShapeTypes.getShapeClass(message.getMessage()));
        }
    }
}
