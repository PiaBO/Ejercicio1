package Facade;

import Abstraction.ToolBarColors;
import Abstraction.ToolBarShape;
import Implementation.Canvas;
import Implementation.PubSubService;
import Implementation.ToolBarColorsImpl;
import Implementation.ToolBarShapeImpl;

public class PaintApplicationImpl implements PaintApplication{
    private ToolBarColors toolBarColors;
    private ToolBarShape toolBarShape;
    private Canvas canvas;
    private PubSubService pubSubService;
    
    public PaintApplicationImpl(){
        pubSubService = new PubSubService();
        toolBarColors = new ToolBarColorsImpl(pubSubService);
        toolBarShape = new ToolBarShapeImpl(pubSubService);
        canvas = new Canvas(pubSubService);
    }
    public void createShape(String shape){
        toolBarShape.createShape(shape);
        toolBarColors.selectBorderColor(toolBarColors.getBorderColor());
        toolBarColors.selectFillColor(toolBarColors.getFillColor());
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
}
