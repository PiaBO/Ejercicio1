package Shapes;

public abstract class Shape {
    protected RectangleContainer rectangleContainer;
    protected String borderColor;
    protected String fillColor;     

    public void setBorderColor(String color){
        System.out.println("Color de border cambiado a: "+color);
        borderColor = color;
    }
    public void setFillColor(String color){
        System.out.println("Color de fondo cambiado a: "+color);
        fillColor = color;
    }
    public String getBorderColor(float color){
        return borderColor;
    }
    public String getFillColor(float color){
        return fillColor;
    }
    public float getX(){
        return rectangleContainer.getX();
    }
    public float getY(){
        return rectangleContainer.getY();
    }
    public float getHeight(){
        return rectangleContainer.getHeight();
    }
    public float getWidth(){
        return rectangleContainer.getWidth();
    }    
    public abstract void draw();
}
