import java.util.Comparator;

/**
 * @author Tanner Dykes (tdykes95)
 * @version 2016.08.09
 *
 */
public class AuthorCompare implements Comparator<Song>
{
    /**
     * this will compare the names of the songs
     */
    @Override
    public int compare(Song nam1, Song nam2) 
    {
        return nam1.name().compareTo(nam2.name()); 
    }
}
