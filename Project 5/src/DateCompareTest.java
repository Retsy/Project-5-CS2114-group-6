import student.TestCase;

/**
 * 
 */

/**
 * @author Tanner Dykes (tdykes95)
 * @version 2016.08.09
 *
 */
public class DateCompareTest extends TestCase
{
//Fields........................................................................
    
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
        DateCompare dat = new DateCompare();
        Song nam = new Song("joe", "can", "sing", "2016");
        Song nam2 = new Song("joe1", "can1", "sing1", "2017");
        assertEquals(-1, dat.compare(nam, nam2));
    }
}
