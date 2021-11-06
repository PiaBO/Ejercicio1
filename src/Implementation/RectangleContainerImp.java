package Implementation;
import Abstraction.*;
import java.lang.Math; 

public class RectangleContainerImp implements RectangleContainer{
    private float topLeft;
    private float topRight; 
    private float bottomLeft;
    private float bottomRight; 
  
    RectangleContainerImp(){
        this.topLeft = (float) Math.random()*10;
        this.topRight = (float) Math.random()*10;
        this.bottomLeft = (float) Math.random()*10;
        this.bottomRight = (float) Math.random()*10;
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
