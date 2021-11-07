package Facade;
import Canvas.Canvas;
import PubSub.PubSubService;
import PubSub.PubSubServiceImpl;
import ToolBarColors.*;
import ToolBarColors.Inerfaces.*;
import ToolBarShape.ToolBarShapeImpl;
import ToolBarShape.Interfaces.ToolBarShape;
import Data.ShapeTypes;

public class PaintApplicationImpl implements PaintApplication{
    private ToolBarColors toolBarColors;
    private ToolBarShape toolBarShape;
    private Canvas canvas;
    private PubSubService pubSubService;
    
    public PaintApplicationImpl(){
        ShapeTypes.init();
        pubSubService = new PubSubServiceImpl();
        toolBarColors = new ToolBarColorsImpl(pubSubService);
        toolBarShape = new ToolBarShapeImpl(pubSubService);
        canvas = new Canvas(pubSubService);
    }
    public void createShape(String shape){
        toolBarShape.createShape(shape);
        canvas.checkMessages();
    }
    public void selectShapeIn(int coordX, int coordY){
        canvas.selectShape(coordX,coordY);
    }
    public void borderColor(String color){
        toolBarColors.selectBorderColor(color);
        canvas.checkMessages();
    }
    public void fillColor(String color){
        toolBarColors.selectFillColor(color);
        canvas.checkMessages();
    }   
    public void draw(){
        canvas.render();
    }
}
