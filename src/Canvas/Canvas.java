package Canvas;
import java.util.ArrayList;
import java.util.List;
import Canvas.Interfaces.*;
import Shapes.*;
import Data.*;
import PubSub.*;
import PubSub.Subscriber.Subscriber;
import PubSub.Subscriber.SubscriberImpl;

public class Canvas implements ICanvas{
    private ArrayList<Shape> shapes;
    private Shape selected;
    private ArrayList<Subscriber> subscriptions;
    private PubSubService pubSubService;

    public Canvas(PubSubService pubSubService){
        shapes = new ArrayList<>();
        subscriptions = new ArrayList<>();
        this.pubSubService = pubSubService;
        subscribe(Channels.BORDER_COLOR);
        subscribe(Channels.FILL_COLOR);
        subscribe(Channels.CREATE_SHAPE);
    }
    public void addShape(Shape shape){
        shapes.add(shape);
        selected = shape;
    }
    public void selectShape(float x, float y){
        System.out.println("Buscando figura...");
        for (Shape shape : shapes){
            if(x > shape.getX() && x < shape.getWidth() && y > shape.getY() && y < shape.getHeight()){
                selected = shape;
                System.out.println("Figura "+shape.getClass().toString()+" selecionada.");
            }
        }
    }
    public void render(){
        for (Shape shape : shapes) {
            System.out.println("Pintando figuras del canvas...");
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
        System.out.println("Canvas buscando mensajes nuevos.");
        for (Subscriber subscriber : subscriptions) {
            List<Message> messages = subscriber.getSubscriberMessages();
            for (Message message : messages) {
                commands(message);
            }
        }  
    }
    public void commands(Message message){
        if(message.getChannel().equals(Channels.FILL_COLOR)){
            System.out.println("Mensaje por el canal: "+Channels.FILL_COLOR+" recibido.");
            selected.setFillColor(message.getMessage());
        }else if(message.getChannel().equals(Channels.BORDER_COLOR)){
            System.out.println("Mensaje por el canal: "+Channels.BORDER_COLOR+" recibido.");
            selected.setBorderColor(message.getMessage());
        }else if(message.getChannel().equals(Channels.CREATE_SHAPE)){
            System.out.println("Mensaje por el canal: "+Channels.CREATE_SHAPE+" recibido.");
            ShapeFactory factory = new ShapeFactoryImpl();
            Shape shape;
            try {
                shape = factory.createShape(ShapeTypes.getShapeClass(message.getMessage()));
                addShape(shape);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
