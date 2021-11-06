package Implementation;
import Abstraction.*;

public class ShapeFactory {
    public Shape createShape(Class<?> shapeType) throws Exception{
        if(shapeType == HeartShape.class){
            return new HeartShape(new RectangleContainer());
        }else if(shapeType == StarShape.class){
            return new StarShape(new RectangleContainer());
        }else if(shapeType == LightingShape.class){
            return new LightingShape(new RectangleContainer());
        }else{
            throw new Exception("Tipo no valido");
        }
     
    }
}
