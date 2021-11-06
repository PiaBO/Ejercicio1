package Implementation;

import Abstraction.Publisher;
import Abstraction.Shape;
import Abstraction.ShapeFactory;
import Abstraction.ToolBarShape;

public class ToolBarShapeImpl implements ToolBarShape{
    private Publisher publisher;
    private ShapeFactory factory;
    private PubSubService pubSubService;

    public ToolBarShapeImpl(){
        factory = new ShapeFactoryImpl();
        publisher = new PublisherIm    
    }
    public Shape createShape(Class<?> shapeType) throws Exception{
        Shape shape = factory.createShape(shapeType);
        if(shape != null){
            return shape;
        }else{
            throw new Exception("Tipo no válido");
        }

    }
}
