import java.util.List;
/**
 * the main sorting method that will run in the background
 * 
 * @author Tanner Dykes (tdykes95)
 * @version 2015.08.08
 */
public class Solution<T> implements LinkedList<T>
{
    //fields..............................................................
    
    /**
     * will sort by name of the songs by finding the strings that are 
     * the songs names
     */
    public List<String> sortName(String anEntry, int a, int begin, int end)
    {
        if (anEntry >= a[end])
        {
            a[end + 1] = anEntry;
        }
        else
        {
            a[end + 1] = a[end];
            sortName(anEntry, a, begin, end - 1);
        }
    }
    
    /**
     * will sort by the artists 
     */
    public List<T> sortArtist()
    {}
    
    /**
     * this will be sorting by the years using ints
     */
    public List<T> sortYear()
    {}
    
    /**
     * will sort by genre using the strings
     */
    public List<T> sortGenre()
    {}
    
    /**
     * will sort by hobby usiing strings
     */
    public List<T> sortHobby()
    {}
}
