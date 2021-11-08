package Shapes;

public interface ShapeFactory {
    public Shape createShape(Class<?> shapeType) throws Exception;
}
