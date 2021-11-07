import Data.ShapeTypes;
import Facade.PaintApplication;
import Facade.PaintApplicationImpl;

public class Main{
    public static void main (String [ ] args) throws Exception {
        PaintApplication app = new PaintApplicationImpl();
        app.createShape(ShapeTypes.HEART_SHAPE_TYPE);
        app.borderColor("Rosa");
        app.fillColor("Morado");

        app.createShape(ShapeTypes.STAR_SHAPE_TYPE);
        app.borderColor("Negro");
        app.fillColor("Amarillo");

        app.draw();

        app.selectShapeIn(0, 10);
    }    
}
