import java.util.Comparator;


/**
 * 
 * 
 * @author Tanner Dykes (tdykes95)
 * @version 2016.08.09
 */
public class TitleCompare implements Comparator<Song>
{
    /**
     * this will compare the names of the songs
     */
    @Override
    public int compare(Song til1, Song til2) 
    {
        return til1.title().compareTo(til2.title()); 
    }
    
}
