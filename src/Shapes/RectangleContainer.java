package Shapes;
// no haria falta la interfaz poruqe es un DTO
// se podria hacer los atributos publicos y no poner los getter
public class RectangleContainer implements RectangleContainerGetter{
    private float x;
    private float y; 
    private float height;
    private float width; 
  
    public RectangleContainer(){
        this.x = (float) Math.random()*10;
        this.y = (float) Math.random()*10;
        this.height = (float) Math.random()*10;
        this.width = (float) Math.random()*10;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public float getHeight(){
        return height;
    }
    public float getWidth(){
        return width;
    }    
}
