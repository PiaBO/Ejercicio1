package Data;
import java.util.HashMap;
import Shapes.HeartShape;
import Shapes.LightingShape;
import Shapes.StarShape;

public final class ShapeTypes {
    public static final String STAR_SHAPE_TYPE = "Estrella";
    public static final String HEART_SHAPE_TYPE = "Corazón";
    public static final String LIGHTING_SHAPE_TYPE = "Rayo";
    public static final HashMap<String,Class<?>> SHAPES = new HashMap<>();

    public static final void init(){
        SHAPES.put(STAR_SHAPE_TYPE, StarShape.class);  
        SHAPES.put(HEART_SHAPE_TYPE, HeartShape.class);
        SHAPES.put(HEART_SHAPE_TYPE, LightingShape.class);  
    }
    public static Class<?> getShapeClass(String className){
        return SHAPES.get(className);
    }
}
