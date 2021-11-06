package Implementation;
import Abstraction.*;

public class HeartShape extends Shape{
    public HeartShape(RectangleContainer rectangleContainer){
        this.rectangleContainer = rectangleContainer;
    }
    public void Draw(){
        System.out.println("Pintando un corazón");
    }
    public void setBorderColor(String color){
        borderColor = color;
    }
    public void setFillColor(String color){
        fillColor = color;
    }
    public String getBorderColor(float color){
        return borderColor;
    }
    public String getFillColor(float color){
        return fillColor;
    }
}    
