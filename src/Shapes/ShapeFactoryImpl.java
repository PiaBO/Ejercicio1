package Shapes;

public class ShapeFactoryImpl implements ShapeFactory {
    public Shape createShape(Class<?> shapeType){
        if(shapeType == HeartShape.class){
            System.out.println("Nuevo corazón creado");
            return new HeartShape(new RectangleContainer());
        }else if(shapeType == StarShape.class){
            System.out.println("Nueva estrella creada");
            return new StarShape(new RectangleContainer());
        }else if(shapeType == LightingShape.class){
            System.out.println("Nuevo rayo creado");
            return new LightingShape(new RectangleContainer());
        }
        return null;
    }
}
