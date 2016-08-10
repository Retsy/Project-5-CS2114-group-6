import student.TestCase;

/**
 * 
 */

/**
 * @author Tanner Dykes (tdykes95)
 * @version 2016.08.09
 *
 */
public class GenreCompareTest extends TestCase 
{
    /**
     * 
     */
    public void setUp()
    {
        // only one thing need to be tested so no need to put anything
        //in the setUp method.
    }
    
    /**
     * 
     */
    public void testCompare()
    {
        GenreCompare gen = new GenreCompare();
        Song nam = new Song("joe", "can", "sing", "2016");
        Song nam2 = new Song("joe1", "can1", "sing1", "2017");
        assertEquals(-1, gen.compare(nam, nam2));
    }
}
