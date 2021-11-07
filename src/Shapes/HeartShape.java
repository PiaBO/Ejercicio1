package Shapes;

public class HeartShape extends Shape{
    public HeartShape(RectangleContainer rectangleContainer){
        this.rectangleContainer = rectangleContainer;
    }
    public void draw(){
        System.out.println("Pintando un corazón de color: "+fillColor);  
    }
}    
