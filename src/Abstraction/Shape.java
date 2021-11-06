package Abstraction;

public abstract class Shape {
    protected RectangleContainer rectangleContainer;
    protected String borderColor;
    protected String fillColor;
    public abstract void setBorderColor(String color);
    public abstract void setFillColor(String color);
    public abstract String getBorderColor(float color);
    public abstract String getFillColor(float color);
    public abstract void Draw();
}
