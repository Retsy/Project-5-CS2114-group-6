/**
 * 
 */
package icecream;
import java.util.Stack;

/**
 * @author Kieran Cronin (croninkm)
 * @version 7/13/2016
 *
 */
public class IceCreamCone implements IceCreamConeADT
{

    /**
     * stack of flavors on the ice cream cone
     */
    Stack<String> flavors;
    /**
     * the number of scoops on the ice cream cone
     */
    int scoops;
    
    /**
     * basic constructor of an empty
     * ice cream cone with no scoops
     */
    public IceCreamCone()
    {
        flavors = new Stack<String>();
        scoops = 0;
    }
    
    /**
     * eats a scoop off the top of the ice cream cone
     * @return String the scoop eaten
     */
    @Override
    public String eatScoop() 
    {
        String eat = flavors.peek();
        flavors.pop();
        scoops--;
        return eat;
    }

    /**
     * adds a scoop on the top of the ice cream cone
     * @param flavor the flavor added
     * 
     */
    @Override
    public void addScoop(String flavor) 
    {
        flavors.push(flavor);
        scoops++;
        
    }

    /**
     * returns the number of scoops on the ice cream cone
     * @return the number of scoops
     */
    @Override
    public int numScoops() 
    {
        
        return scoops;
    }

    /**
     * returns true or false based on whether the 
     * flavor searched for was on the cone
     * @param flavor the flavor searched for
     * @return boolean true or false
     */
    @Override
    public boolean contains(String flavor) 
    {
        return flavors.search(flavor) > 0;
        
    }

    /**
     * returns true or false based on if the cone is
     * empty
     * @return boolean true or false
     */
    @Override
    public boolean emptyCone() 
    {
        return flavors.empty();
    }
    

    /**
     * returns the top scoop on the ice cream cone
     * @return the top flavor
     */
    @Override
    public String currentScoop() 
    {
        
        return flavors.peek();
    }
    
    /**
     * tests if two items are equal to each other
     * @param other the other object compared
     * @return boolean true or false
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null) || (other.getClass() != IceCreamCone.class)) {
            return false;
        }
        return flavors.equals(((IceCreamCone) other).flavors);
    }
    
    /**
     * returns a string based on the flavors on
     * the ice cream cone
     * @return String of flavors in order
     */
    public String toString()
    {
//        Stack<String> newStack = flavors;
//        int j = flavors.size();
//        StringBuilder string = new StringBuilder("[ ");
//        for (int i = 0; i < j; i++)
//        {
//            
//            string.append(newStack.pop());
//            if (i < j)
//            {
//                string.append(", ");
//            }
//            else
//            {
//                string.append("]");
//            }
//        }
        
        //return string.toString();
        return flavors.toString();
        
    }
    

}
