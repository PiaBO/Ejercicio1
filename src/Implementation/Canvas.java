package Implementation;
import Abstraction.*;
import java.util.ArrayList;

public class Canvas implements CanvasAdd, CanvasPointer, CanvasRender{
    private ArrayList<Shape> shapes;
    private Shape selected;

    Canvas(){
        shapes = new ArrayList<>();
    }
    public void addShape(Shape shape){
        shapes.add(shape);
        selected = shape;
    }
    public void selectShape(float x, float y){
        for (Shape shape : shapes){
            if(x > shape.getX() && x < shape.getWidth() && y > shape.getY() && y < shape.getHeight()){
                selected = shape;
            }
        }
    }
    public void render(){
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
