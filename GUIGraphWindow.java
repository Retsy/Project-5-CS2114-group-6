import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

public class GUIGraphWindow implements Observer 
{
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
    private LinkedList<Song> songs;
    int firstIndex;
    
    public GUIGraphWindow(LinkedList<Song> songList)
    {        
        window = new Window();
        window.setTitle("Project 5");
        window.setSize(1200, 700);
        firstIndex = 0;
        
        songs = songList;
        
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
        
        displaySongs(songList);
        displayBlackBars();
        legend();
        
        GUIBar bar = new GUIBar(0);
        window.addShape(bar);
    }

    /**
     * 
     */
    @Override
    public void update(Observable o, Object arg) 
    {
        if (arg.getClass() == PositionENUM.class)
        {
            PositionENUM position = (PositionENUM) arg;
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
        
        if (songs.get(firstIndex - 9) != null)
        {
            window.removeAllShapes();
            displayBlackBars();
            firstIndex = firstIndex - 9;
            displaySongs(songs);
        }
    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedNext(Button button) 
    {
        if (songs.get(firstIndex + 9) != null)
        {
            window.removeAllShapes();
            displayBlackBars();
            firstIndex = firstIndex + 9;
            displaySongs(songs);
        }
    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedSortByArtistName(Button button) 
    {
        firstIndex = 0;
        window.removeAllShapes();
        displayBlackBars();
        songs.getListByAuthor();
        displaySongs(songs);
    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedSortBySongTitle(Button button) 
    {
        firstIndex = 0;
        window.removeAllShapes();
        displayBlackBars();
        songs.getListByTitle();
        displaySongs(songs);
    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedSortByReleaseYear(Button button) 
    {
        firstIndex = 0;
        window.removeAllShapes();
        displayBlackBars();
        songs.getListByDate();
        displaySongs(songs);
    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedSortByGenre(Button button) 
    {
        firstIndex = 0;
        window.removeAllShapes();
        displayBlackBars();
        songs.getListByGenre();
        displaySongs(songs);
    }
    
    /**
     * The clickedSolve(Button button) method supports Solve button.
     * @param button clickedSolve button
     */
    public void clickedRepresentHobby(Button button) 
    {

    }
    
//    public void setTitle()
//    {
//        TextShape textShape = new TextShape(0, 0, Song.class.toString());
//        int x = window.getGraphPanelWidth();
//        int y = window.getGraphPanelHeight();
//        int width = textShape.getWidth();
//        int height = textShape.getHeight();
//        textShape.setX((x- width)/2);
//        textShape.setY((y - height)/2); 
//        
//        window.addShape(textShape); 
//    }
    
    public void setLocation(Shape shape, PositionENUM pos)
    {
        if (pos == PositionENUM.NorthWest)
        {
            shape.moveTo(this.getWindow().getGraphPanelWidth() / 4 - shape.getWidth() / 2 - 150,
                    this.getWindow().getGraphPanelHeight() / 4 - 75);
        }
        else if (pos == PositionENUM.North)
        {
            shape.moveTo(this.getWindow().getGraphPanelWidth() / 2 - shape.getWidth() / 2 - 150,
                    this.getWindow().getGraphPanelHeight() / 4 - 75);
        }
        else if (pos == PositionENUM.NorthEast)
        {
            shape.moveTo(this.getWindow().getGraphPanelWidth() / 4 * 3 - shape.getWidth() / 2 - 150,
                    this.getWindow().getGraphPanelHeight() / 4 - 75);
        }
        
        else if (pos == PositionENUM.West)
        {
            shape.moveTo(this.getWindow().getGraphPanelWidth() / 4 - shape.getWidth() / 2 - 150,
                    this.getWindow().getGraphPanelHeight() / 2 - 75);
        }
        else if (pos == PositionENUM.Middle)
        {
            shape.moveTo(this.getWindow().getGraphPanelWidth() / 2 - shape.getWidth() / 2 - 150,
                    this.getWindow().getGraphPanelHeight() / 2 - 75);
        }
        else if (pos == PositionENUM.East)
        {
            shape.moveTo(this.getWindow().getGraphPanelWidth() / 4 * 3 - shape.getWidth() / 2 - 150,
                    this.getWindow().getGraphPanelHeight() / 2 - 75);
        }
        
        else if (pos == PositionENUM.SouthWest)
        {
            shape.moveTo(this.getWindow().getGraphPanelWidth() / 4 - shape.getWidth() / 2 - 150,
                    this.getWindow().getGraphPanelHeight() / 4 * 3 - 75);
        }
        else if (pos == PositionENUM.South)
        {
            shape.moveTo(this.getWindow().getGraphPanelWidth() / 2 - shape.getWidth() / 2 - 150,
                    this.getWindow().getGraphPanelHeight() / 4 * 3 - 75);
        }
        else if (pos == PositionENUM.SouthEast)
        {
            shape.moveTo(this.getWindow().getGraphPanelWidth() / 4 * 3 - shape.getWidth() / 2 - 150,
                    this.getWindow().getGraphPanelHeight() / 4 * 3 - 75);
        }
        
    }
    
    public void displaySongs(LinkedList<Song> list)
    {
        northWest = new TextShape(0, 0, list.get(firstIndex).title() + "\n" +" by " + list.get(firstIndex).name());
        north = new TextShape(0, 0, list.get(firstIndex + 1).title() + "\n" + " by " + list.get(firstIndex + 1).name());
        northEast = new TextShape(0, 0, list.get(firstIndex + 2).title() + "\n" + " by " + list.get(firstIndex + 2).name());
        west = new TextShape(0, 0, list.get(firstIndex + 3).title() + "\n" + " by " + list.get(firstIndex + 3).name());
        middle = new TextShape(0, 0, list.get(firstIndex + 4).title() + "\n" + " by " + list.get(firstIndex + 4).name());
        east = new TextShape(0, 0, list.get(firstIndex + 5).title() + "\n" + " by " + list.get(firstIndex + 5).name());
        southWest = new TextShape(0, 0, list.get(firstIndex + 6).title() + "\n" + " by " + list.get(firstIndex + 6).name());
        south = new TextShape(0, 0, list.get(firstIndex + 7).title() + "\n" + " by " + list.get(firstIndex + 7).name());
        southEast = new TextShape(0, 0, list.get(firstIndex + 8).title() + "\n" + " by " + list.get(firstIndex + 8).name());
        
        window.addShape(northWest);
        window.addShape(north);
        window.addShape(northEast);
        window.addShape(west);
        window.addShape(middle);
        window.addShape(east);
        window.addShape(southWest);
        window.addShape(south);
        window.addShape(southEast);
        
        
        
        
        setLocation(northWest, PositionENUM.NorthWest);
        setLocation(north, PositionENUM.North);
        setLocation(northEast, PositionENUM.NorthEast);
        setLocation(west, PositionENUM.West);
        setLocation(middle, PositionENUM.Middle);
        setLocation(east, PositionENUM.East);
        setLocation(southWest, PositionENUM.SouthWest);
        setLocation(south, PositionENUM.South);
        setLocation(southEast, PositionENUM.SouthEast);
        
    }
    
    public void displayBlackBars()
    {
        Shape bar;
        for (int i = 1; i < 4; i++)
        {
            for (int j = 1; j < 4; j++)
            {
                bar = new Shape(0, 0, 8, 60, Color.BLACK);
                window.addShape(bar);
                bar.moveTo(this.getWindow().getGraphPanelWidth() / 4 * j - bar.getWidth() / 2 - 150,
                        this.getWindow().getGraphPanelHeight() / 4 * i - 25);
            }
        }
        
    }
    
    
    /**
     * 
     */
    public void legend()
    {
        int x = window.getGraphPanelWidth();
        int y = window.getGraphPanelHeight();
        
        Shape blackBox = new Shape(x - 300, y - 300, 202, 242, Color.BLACK);
        Shape whiteBox = new Shape(x - 298, y - 298, 198, 238, Color.WHITE);
        
        
        
        int width = whiteBox.getWidth();
        int height = whiteBox.getHeight();
        
        GUIBar bar = new GUIBar(30);
        
        
        TextShape read = new TextShape(x, y, "Read", Color.PINK);
        TextShape art = new TextShape(x, y - height - 2, "Art", Color.BLUE);
        TextShape sports = new TextShape(x, y - height - 4, "Sport", Color.YELLOW);
        TextShape music = new TextShape(x, y - height - 6, "Music", Color.GREEN);
        TextShape song = new TextShape(x, y - height - 8, "SongTitle", Color.BLACK);
        TextShape heard = new TextShape(x, y - height - 10, "Heard", Color.BLACK);
        TextShape likes = new TextShape(x, y - height - 12, "Likes", Color.BLACK);
        
        window.addShape(read);
        window.addShape(art);
        window.addShape(sports);
        window.addShape(music);
        window.addShape(song);
        window.addShape(heard);
        window.addShape(likes);
        
        read.setBackgroundColor(Color.WHITE);
        art.setBackgroundColor(Color.WHITE);
        sports.setBackgroundColor(Color.WHITE);
        music.setBackgroundColor(Color.WHITE);
        song.setBackgroundColor(Color.WHITE);
        heard.setBackgroundColor(Color.WHITE);
        likes.setBackgroundColor(Color.WHITE);
        
        
        window.addShape(whiteBox);
        window.addShape(blackBox);
    }
        
}