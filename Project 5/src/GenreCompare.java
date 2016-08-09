import java.util.Comparator;

/**
 * 
 */

/**
 * @author Tanner Dykes (tdykes95)
 * @version 2016.08.09
 *
 */
public class GenreCompare implements Comparator<Song>
{
    /**
     * this will compare the names of the songs
     */
    @Override
    public int compare(Song gen1, Song gen2) 
    {
        return gen1.genre().compareTo(gen2.genre()); 
    }
}
