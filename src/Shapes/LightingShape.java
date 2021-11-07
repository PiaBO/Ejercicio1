package Shapes;

public class LightingShape extends Shape {
    public LightingShape(RectangleContainer rectangleContainer){
        this.rectangleContainer = rectangleContainer;
    }
    public void draw(){
        System.out.println("Pintando un rayode color: "+fillColor);  
    }
  
}
