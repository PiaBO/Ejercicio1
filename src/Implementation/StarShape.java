package Implementation;
import Abstraction.*;

public class StarShape extends Shape {
    public StarShape(RectangleContainer rectangleContainer){
        this.rectangleContainer = rectangleContainer;
    }
    public void Draw(){
        System.out.println("Pintando una estrella en x: "+rectangleContainer.getTopLeft()+" y color: "+fillColor);  
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
