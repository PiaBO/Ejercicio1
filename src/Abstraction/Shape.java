package Abstraction;

public abstract class Shape {
    protected RectangleContainer rectangleContainer;
    protected String borderColor;
    protected String fillColor;
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
    public abstract void draw();
}
