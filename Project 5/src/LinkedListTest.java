/**
 * Test the LinkedList class.
 * 
 * @author Haokun Liu (haokun)
 * @version 2016.08.06
 *
 */
public class LinkedListTest extends student.TestCase
{
    /**
     * Add a new SinglyLinkedList.
     */
    LinkedList<String> list1;
    /**
     * Add a new SinglyLinkedList.
     */
    LinkedList<String> list2;
    /**
     * Add a new SinglyLinkedList.
     */
    LinkedList<String> list3;
    
    /**
     * Initial the test case.
     */
    public void setUp()
    {
        list1 = new LinkedList<String>();
        list2 = new LinkedList<String>();
        list3 = new LinkedList<String>();
        
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        
        list3.add("1");
    }
    
    /**
     * Test size() method.
     */
    public void testSize()
    {
        assertEquals(list1.size(), 4);
    }
      
    /**
     * Test add(int index, E obj) method.
     */
    public void testAdd1()
    {
        list1.add(3, "0");
        assertEquals(list1.toString(), "{1, 2, 3, 0, 4}");
        assertEquals(list1.size(), 5);
        
        list1.add(0, "0");
        assertEquals(list1.toString(), "{0, 1, 2, 3, 0, 4}");
        assertEquals(list1.size(), 6);
        
        list1.add(6, "0");
        assertEquals(list1.toString(), "{0, 1, 2, 3, 0, 4, 0}");
        assertEquals(list1.size(), 7);
        
        
        list2.add(0, "1");
        assertEquals(list2.toString(), "{1}");
        assertEquals(list2.size(), 1);
        
        list3.add(0, "0");
        assertEquals(list3.toString(), "{0, 1}");
        assertEquals(list3.size(), 2);
    }
     
    /**
     * Test add(int index, E obj) method.
     */
    public void testAdd1E1()
    {
        Exception thrown = null;
        try 
        {
            list1.add(5, null);
        } 
        catch (Exception exception) 
        {

            thrown = exception;
        }

        // checks whether an Exception was actually thrown
        assertNotNull(thrown);

        // checks whether the right type of Exception was thrown
        assertTrue(thrown instanceof IllegalArgumentException);
        assertEquals(list1.size(), 4);
    }
    
    /**
     * Test add(int index, E obj) method.
     */
    public void testAdd1E2()
    {
        Exception thrown1 = null;
        try 
        {
            list1.add(-1, "0");
        } 
        catch (Exception exception) 
        {

            thrown1 = exception;
        }

        // checks whether an Exception was actually thrown
        assertNotNull(thrown1);

        // checks whether the right type of Exception was thrown
        assertTrue(thrown1 instanceof IndexOutOfBoundsException);
        assertEquals(list1.size(), 4);
        
        Exception thrown2 = null;
        try 
        {
            list1.add(9, "0");
        } 
        catch (Exception exception) 
        {

            thrown2 = exception;
        }

        // checks whether an Exception was actually thrown
        assertNotNull(thrown2);

        // checks whether the right type of Exception was thrown
        assertTrue(thrown2 instanceof IndexOutOfBoundsException);
        assertEquals(list1.size(), 4);
    }
    
    /**
     * Test add(int index, E obj) method.
     */
    public void testAdd2()
    {
        list1.add("0");
        assertEquals(list1.toString(), "{1, 2, 3, 4, 0}");
        assertEquals(list1.size(), 5);
        
        list2.add("0");
        assertEquals(list2.toString(), "{0}");
        assertEquals(list2.size(), 1);
        
        list3.add("0");
        assertEquals(list3.toString(), "{1, 0}");
        assertEquals(list3.size(), 2);
    } 
    
    /**
     * Test add(int index, E obj) method.
     */
    public void testAdd2E()
    {
        Exception thrown = null;
        try 
        {
            list1.add(null);
        } 
        catch (Exception exception) 
        {

            thrown = exception;
        }

        // checks whether an Exception was actually thrown
        assertNotNull(thrown);

        // checks whether the right type of Exception was thrown
        assertTrue(thrown instanceof IllegalArgumentException);
    } 
    
    /**
     * Test isEmpty() method.
     */
    public void testIsEmpty()
    {
        assertTrue(list2.isEmpty());
        assertFalse(list1.isEmpty());
        assertFalse(list3.isEmpty());
    }
    
    /**
     * Test remove(T obj) method.
     */
    public void testRemove1()
    {
        assertTrue(list1.remove("1"));
        assertEquals(list1.toString(), "{2, 3, 4}");
        
        assertTrue(list1.remove("4"));
        assertEquals(list1.toString(), "{2, 3}");
        
        assertFalse(list1.remove("5"));
        
        assertFalse(list2.remove("0"));
        
        assertTrue(list3.remove("1"));
        assertEquals(list3.toString(), "{}");

    }
    
    /**
     * Test remove(E obj) method.
     */
    public void testRemove3()
    {
        assertTrue(list1.remove("2"));
        assertEquals(list1.toString(), "{1, 3, 4}");
    }
    
    /**
     * Test remove(int index) method.
     */
    public void testRemove2()
    {
        assertTrue(list1.remove(3));
        assertEquals(list1.toString(), "{1, 2, 3}");
        assertTrue(list1.remove(0));
        assertEquals(list1.toString(), "{2, 3}");
        assertTrue(list1.remove(1));
        assertEquals(list1.toString(), "{2}");
        
        assertTrue(list3.remove(0));
        assertEquals(list3.toString(), "{}");
    }
    
    /**
     * Test remove(int index) method.
     */
    public void testRemove2E()
    {
        Exception thrown1 = null;
        try 
        {
            list1.remove(-1);
        } 
        catch (Exception exception) 
        {

            thrown1 = exception;
        }

        // checks whether an Exception was actually thrown
        assertNotNull(thrown1);

        // checks whether the right type of Exception was thrown
        assertTrue(thrown1 instanceof IndexOutOfBoundsException);
        
        Exception thrown2 = null;
        try 
        {
            list1.remove(40);
        } 
        catch (Exception exception) 
        {

            thrown2 = exception;
        }

        // checks whether an Exception was actually thrown
        assertNotNull(thrown2);

        // checks whether the right type of Exception was thrown
        assertTrue(thrown2 instanceof IndexOutOfBoundsException);
    }
    
    /**
     * Test get(int index) method.
     */
    public void testGet()
    {
        assertEquals(list1.get(0), "1");
        assertEquals(list1.get(3), "4");
        assertEquals(list1.get(2), "3");
        
        assertEquals(list3.get(0), "1");
    }
    
    /**
     * Test get(int index) method.
     */
    public void testGetE()
    {
        Exception thrown = null;
        try 
        {
            list1.get(5);
        } 
        catch (Exception exception) 
        {

            thrown = exception;
        }

        // checks whether an Exception was actually thrown
        assertNotNull(thrown);

        // checks whether the right type of Exception was thrown
        assertTrue(thrown instanceof IndexOutOfBoundsException);
    }
    
    /**
     * Test contains(E obj) method.
     */
    public void testContains()
    {
        assertTrue(list1.contains("1"));
        assertTrue(list1.contains("4"));
        assertTrue(list1.contains("3"));
        assertFalse(list1.contains("6"));
        
        assertFalse(list2.contains("1"));
        
        assertTrue(list3.contains("1"));
    }
    
    /**
     * Test clear() method.
     */
    public void testClear()
    {
        list1.clear();
        assertTrue(list1.isEmpty());
        assertEquals(list1.size(), 0);
        
        list2.clear();
        assertTrue(list1.isEmpty());
        assertEquals(list1.size(), 0);
        
        list3.clear();
        assertTrue(list3.isEmpty());
        assertEquals(list1.size(), 0);
        
    }
    
    /**
     * Test toString() method.
     */
    public void testToString()
    {
        assertEquals(list1.toString(), "{1, 2, 3, 4}");
        assertEquals(list2.toString(), "{}");
        assertEquals(list3.toString(), "{1}");
    }
}

