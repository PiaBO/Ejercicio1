package Implementation;
import Abstraction.*;

public class ShapeFactory {
    public Shape createShape(Class<?> shapeType){
        if(shapeType == HeartShape.class){
            return new HeartShape(new RectangleContainerImp());
        }else if(shapeType == StarShape.class){
            return new StarShape(new RectangleContainerImp());
        }else if(shapeType == LightingShape.class){
            return new LightingShape(new RectangleContainerImp());
        }
        return null;
    }
}
