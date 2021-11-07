package Facade;

public interface PaintApplication {
    public void createShape(String Shape);
    public void selectShapeIn(int coordX, int coordY);
    public void borderColor(String color);
    public void fillColor(String color);
}
