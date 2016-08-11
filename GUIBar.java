package project5;

import java.awt.Color;

import CS2114.Shape;
import CS2114.Window;

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
        super(0, 0, size, 2);
        
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
    public void changeHeardSize()
    {
        //Size changed with heard number for each hobby
    }
    
    /**
     * Change the size of the bar with likes.
     */
    public void changeLikesSize()
    {
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
}