package project5;

import java.awt.Color;

import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import methods.Song;

/**
 * The GUIBar is to determine the Bar size and title.
 * 
 * @author  Haokun Liu (haokun)
 * @version 2016.08.09
 */

public class GUIBar extends Shape
{
    private int size;
    private Position northEast;
    private Position southEast;
    private Position northWest;
    private Position southWest;
    private Position north;
    private Position south;
    private Position west;
    private Position east;
    private Position middle;
    
    /**
     * Initial the GUIBar with 
     * @param length
     */
    public GUIBar(int size)
    {
        super(0, 0, size, 3);
        
        northEast = Position.NorthEast;
        southEast = Position.SouthEast;
        northWest = Position.NorthWest;
        southWest = Position.SouthWest;
        north = Position.North;
        south = Position.South;
        west = Position.West;
        east = Position.East;
        middle = Position.Middle;
        
        this.size = size;
    }
    
    /**
     * Change the size of the bar with heard.
     */
    public int HeardSize()
    {
        return size;
        //Size changed with heard number for each hobby
    }
    
    /**
     * Change the size of the bar with likes.
     */
    public int LikesSize()
    {
        return size;
      //Size changed with heard number for each hobby
    }
    
    /**
     * @param position the Bar's position.
     */
    public Position setPosition(Position position)
    {
        switch(position) 
        {
            case NorthEast: 
                return northEast;
            case SouthEast: 
                return southEast;
            case NorthWest: 
                return northWest;
            case SouthWest:
                return southWest;
            case North:
                return north;
            case South:
                return south;
            case West:
                return west;
            case East:
                return east;
            case Middle:
                return middle;
            default: 
                return middle;
        }
    }
    
    public void setTitle(Window window)
    {
        TextShape textShape = new TextShape(0, 0, Song.class.toString());        
        window.addShape(textShape); 
    }
    
    public void setColor(Window window)
    {
        Shape shape1 = new Shape(0, 0, HeardSize(), Color.PINK);
        Shape shape2 = new Shape(0, 0, LikesSize(), Color.PINK);
        Shape shape3 = new Shape(0, 0, HeardSize(), Color.BLUE);
        Shape shape4 = new Shape(0, 0, LikesSize(), Color.BLUE);
        Shape shape5 = new Shape(0, 0, HeardSize(), Color.YELLOW);
        Shape shape6 = new Shape(0, 0, LikesSize(), Color.YELLOW);
        Shape shape7 = new Shape(0, 0, HeardSize(), Color.GREEN);
        Shape shape8 = new Shape(0, 0, LikesSize(), Color.GREEN);
        
        window.addShape(shape1); 
        window.addShape(shape2); 
        window.addShape(shape3); 
        window.addShape(shape4); 
        window.addShape(shape5);
        window.addShape(shape6); 
        window.addShape(shape7);
        window.addShape(shape8); 
    }
}