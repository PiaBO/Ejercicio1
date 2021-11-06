import Abstraction.*;
import Implementation.*;

public class Main{
    public static void main (String [ ] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape corazon = factory.createShape(HeartShape.class);
        Shape estrella = factory.createShape(StarShape.class);
        Shape rayo = factory.createShape(LightingShape.class);
        corazon.draw();
        estrella.draw();
        rayo.draw();
    }    
}
