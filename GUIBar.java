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
    private int size = 0;
    private Position northEast;
    private Position southEast;
    private Position northWest;
    private Position southWest;
    private Position north;
    private Position south;
    private Position west;
    private Position east;
    private Position middle;
    private Song song;
    
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
        song = new Song("j", "l", "k", "1995");
        
        this.size = size;
    }
    
    /**
     * Change the size of the bar with heard.
     */
    public int heardSize()
    {
        return song.getHeard(song.hobbyArray.toString());
    }
    
    /**
     * Change the size of the bar with likes.
     */
    public int likesSize()
    {
        return song.getLikes(song.hobbyArray.toString());
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
    
    /**
     * 
     */
    public GUIBar percetageOfLikes()
    {
        GUIBar bar = new GUIBar(likesSize());
        return bar;
    }
    
    /**
     * 
     */
    public GUIBar percetageOfHeards()
    {
        GUIBar bar = new GUIBar(heardSize());
        return bar;
    }
}
