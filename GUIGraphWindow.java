package project5;

import java.util.Observable;
import java.util.Observer;

import CS2114.Button;
import CS2114.Shape;
import CS2114.Window;
import CS2114.WindowSide;

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
    
    public GUIGraphWindow(Solution solution)
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
    }

    /**
     */
    @Override
    public void update(Observable o, Object arg) 
    {
        // TODO Auto-generated method stub
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
    
}
