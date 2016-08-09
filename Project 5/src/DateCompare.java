import java.util.Comparator;

/**
 * 
 */

/**
 * @author Tanner Dykes (tdykes95)
 * @version 2016.08.09
 *
 */
public class DateCompare implements Comparator<Song>
{
    /**
     * this will compare the names of the songs
     */
    @Override
    public int compare(Song dat1, Song dat2) 
    {
        return dat1.date().compareTo(dat2.date()); 
    }
}
