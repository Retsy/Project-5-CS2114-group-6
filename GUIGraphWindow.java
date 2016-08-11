package project5;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;
import methods.Song;

public class GUIGraphWindow implements Observer 
{
    private Solution solution;
    private Shape northEast;
    private Shape southEast;
    private Shape northWest;
    private Shape southWest;
    private Shape north;
    private Shape south;
    private Shape west;
    private Shape east;
    private Shape middle;
    private Window window;
    
    public GUIGraphWindow()
    {        
        window = new Window();
        Button quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");
        window.addButton(quitButton, WindowSide.SOUTH);
        
        Button preButton = new Button("<-Pre");
        preButton.onClick(this, "clickedPre");
        window.addButton(preButton, WindowSide.NORTH);
        
        Button SortNameButton = new Button("Sort by Artist Name");
        SortNameButton.onClick(this, "clickedSortByArtistName");
        window.addButton(SortNameButton, WindowSide.NORTH);
        
        Button SortSongButton = new Button("Sort by Song Title");
        SortSongButton.onClick(this, "clickedSortBySongTitle");
        window.addButton(SortSongButton, WindowSide.NORTH);
        
        Button SortYearButton = new Button("Sort by Release Year");
        SortYearButton.onClick(this, "clickedSortByReleaseYear");
        window.addButton(SortYearButton, WindowSide.NORTH);
        
        Button SortGenreButton = new Button("Sort by Genre");
        SortGenreButton.onClick(this, "clickedSortByGenre");
        window.addButton(SortGenreButton, WindowSide.NORTH);
        
        Button nextButton = new Button("next->");
        nextButton.onClick(this, "clickedNext");
        window.addButton(nextButton, WindowSide.NORTH);
        
        GUIBar bar = new GUIBar(2);
        window.addShape(bar);
        
        int x = window.getGraphPanelWidth();
        int y = window.getGraphPanelHeight();
        
        northEast = new Shape(x^5/6, y/3, 5, 50, Color.BLACK);
        southEast = new Shape(x^5/6, y^2/3, 5, 50, Color.BLACK);
        northWest = new Shape(x/6, y/3, 5, 50, Color.BLACK);
        southWest = new Shape(x^5/6, y/3, 5, 50, Color.BLACK);
        
        north = new Shape(x/3, y/2, 5, 50, Color.BLACK);
        south = new Shape(x/4, y/2, 5, 50, Color.BLACK);
        west = new Shape(x/4, y/2, 5, 50, Color.BLACK);
        east = new Shape(x/4, y/2, 5, 50, Color.BLACK);
        middle = new Shape(x/2, y/2, 5, 50, Color.BLACK);
        
        window.addShape(northEast);
        window.addShape(southEast);
        window.addShape(northWest);
        window.addShape(southWest);
        window.addShape(north);
        window.addShape(south);
        window.addShape(west);
        window.addShape(east);
        window.addShape(middle);
    }

    /**
     * 
     */
    @Override
    public void update(Observable o, Object arg) 
    {
        if (arg.getClass() == Position.class)
        {
            Position position = (Position) arg;
        }
    }
    
    
    /**
     * Return the window 
     * @return the window.
     */
    public Window getWindow()
    {
        return window;
    }
    
    /**
     * The button using to quit the window.
     * @param button quit the window
     */
    public void clickedQuit(Button button) 
    {
        System.exit(0);
    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedPre(Button button) 
    {

    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedNext(Button button) 
    {

    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedSortByArtistName(Button button) 
    {

    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedSortBySongTitle(Button button) 
    {

    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedSortByReleaseYear(Button button) 
    {

    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedSortByGenre(Button button) 
    {

    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedRepresentHobby(Button button) 
    {

    }
    
    public void setTitle()
    {
        TextShape textShape = new TextShape(0, 0, Song.class.toString());
        int x = window.getGraphPanelWidth();
        int y = window.getGraphPanelHeight();
        int width = textShape.getWidth();
        int height = textShape.getHeight();
        textShape.setX((x- width)/3);
        textShape.setY((y - height)/3); 
        
        window.addShape(textShape); 
    }
}