package Implementation;
import Abstraction.*;

public class HeartShape extends Shape{
    public HeartShape(RectangleContainer rectangleContainer){
        this.rectangleContainer = rectangleContainer;
    }
    public void draw(){
        System.out.println("Pintando un corazón");
    }
}    
