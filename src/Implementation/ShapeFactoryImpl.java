package Implementation;
import Abstraction.Shape;
import Abstraction.ShapeFactory;

public class ShapeFactoryImpl implements ShapeFactory {
    public Shape createShape(Class<?> shapeType){
        if(shapeType == HeartShape.class){
            return new HeartShape(new RectangleContainer());
        }else if(shapeType == StarShape.class){
            return new StarShape(new RectangleContainer());
        }else if(shapeType == LightingShape.class){
            return new LightingShape(new RectangleContainer());
        }
        return null;
    }
}
