package Implementation;
import Abstraction.*;

public class StarShape extends Shape {
    public StarShape(RectangleContainer rectangleContainer){
        this.rectangleContainer = rectangleContainer;
    }
    public void draw(){
        System.out.println("Pintando una estrella de color: "+fillColor);  
    }
}
