package Implementation;
import Abstraction.*;

public class LightingShape extends Shape {
    public LightingShape(RectangleContainer rectangleContainer){
        this.rectangleContainer = rectangleContainer;
    }
    public void draw(){
        System.out.println("Pintando un rayo");
    }
  
}
