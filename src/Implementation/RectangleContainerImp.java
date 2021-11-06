package Implementation;
import Abstraction.*;

public class RectangleContainerImp implements RectangleContainer{
    private float topLeft;
    private float topRight; 
    private float bottomLeft;
    private float bottomRight; 
  
    private RectangleContainerImp(float topLeft, float topRight, float bottomLeft, float bottomRight){
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
    public float getTopLeft(){
        return topLeft;
    }
    public float getBottomLeft(){
        return bottomLeft;
    }
    public float getTopRight(){
        return topRight;
    }
    public float getBottomRight(){
        return bottomRight;
    }    
}
