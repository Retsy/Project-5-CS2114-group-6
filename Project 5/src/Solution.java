import java.util.Comparator;
import java.util.List;

/**
 * the main sorting method that will run in the background
 * 
 * @author Tanner Dykes (tdykes95)
 * @version 2015.08.08
 */
public class Solution<T> extends LinkedList<T>
{
    //fields..............................................................
    LinkedList<T> list = new LinkedList<T>();
    
    public void sort(Comparator comp) 
    {
        
        if (list.size() > 1)
        {
            Node unsortedPart = firstNode.getNextNode();
            firstNode.setNextNode(null);
            
            while (unsortedPart != null)
            {
                Node nodeToInsert = unsortedPart;
                unsortedPart = unsortedPart.getNextNode();
                list.insertInOrder(nodeToInsert);
            }
        }
        
        Node currentNode = firstNode;
        Node previousNode = null;
        
        while ((currentNode != null) && 
                (comp.compare(arg0, arg1)))
        {
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        
        if (previousNode != null)
        {
            previousNode.setNextNode(nodeToInsert);
            firstNode = nodeToInsert;
        }
    }
    
}
