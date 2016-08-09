/**
 * A class that implements the ADT list by using a chain of
 *  linked nodes that has a head reference.
 *  
 * @author Haokun Liu (haokun)
 * @version 2016.08.06
 */

public class LinkedList<T> implements LinkedListInterface<T> 
{
    // The first node in the list
    private Node<T> firstNode; 
    
    // The total number of entries in the list
    private int numberOfEntries; 
    
    private class Node<D>
    {
        // The data element stored in the node.
        private D data; 
        
        // The next node in the sequence.
        private Node<D> next; 

        /**
         * Creates a new node with the given data
         * @param d  the data to put inside the node
         */
        private Node(D dataPortion)
        {
            data = dataPortion;
            next = null;   
        } 

        /**
         * Creates a new node with the given data
         * @param dataPortion  the data to put inside the node
         * @param nextNode the next node 
         */
        private Node(D dataPortion, Node<D> nextNode)
        {
            data = dataPortion;
            next = nextNode;   
        } 

        /**
         * Gets the data in the node.
         * @return the data in the node
         */
        private D getData()
        {
            return data;
        } 

        /**
         * Set the data to the node
         * @param newData A new data
         */
        private void setData(D newData)
        {
            data = newData;
        } 

        /**
         * Gets the next node
         * @return the next node
         */
        private Node<D> getNextNode()
        {
            return next;
        } 

        /**
         * Set the next node of list
         * @param nextNode the next node
         */
        private void setNextNode(Node<D> nextNode)
        {
            next = nextNode;
        } 
    }
    
    /**
     * Initial the linked list.
     */
    public LinkedList()
    {
        firstNode = null;
        numberOfEntries = 0;
    }
    
    /** 
     * Adds a new entry to the end of this list.
     * Entries currently in the list are unaffected.
     * The list's size is increased by 1.
     * @param newEntry  The object to be added as a new entry. 
     * @throws IllegalArgumentException
     *             if newEntry is null
     */
    public void add(T newEntry)
    {
        if (newEntry == null) 
        {
            throw new IllegalArgumentException("Object is null");
        }

        Node<T> current = firstNode;
        if (isEmpty()) 
        {
            firstNode = new Node<T>(newEntry);
        }
        else 
        {
            while (current.next != null) 
            {
                current = current.next;
            }
            current.setNextNode(new Node<T>(newEntry));
        }
        numberOfEntries++;
    }

    /** 
     * Adds a new entry at a specified position within this list.
     * Entries originally at and above the specified position
     * are at the next higher position within the list.
     * The list's size is increased by 1.
     * @param newPosition  An integer that specifies the desired
     *                     position of the new entry.
     * @param newEntry     The object to be added as a new entry.
     * @throws  IndexOutOfBoundsException if either
     *          newPosition < 1 or newPosition > size() + 1. 
     * @throws IllegalArgumentException
     *         if newEntry is null         
     */
    public void add(int index, T newEntry)
    {
        if (null == newEntry) 
        {
            throw new IllegalArgumentException("Object is null");
        }

        if ((0 > index) || (size() < index)) 
        {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node<T> current = firstNode;

        if (isEmpty()) 
        {
            firstNode = new Node<T>(newEntry);
        }
        else 
        {
            int currentIndex = 0;
            boolean found = false;
            
            while (!found && (current != null)) 
            {
                if (index == currentIndex + 1) 
                {
                    Node<T> nextNext = current.next;
                    Node<T> newNode = new Node<T>(newEntry);
                    current.setNextNode(newNode);
                    newNode.setNextNode(nextNext);
                    found = true;
                }
                else if (index == 0)
                {
                    Node<T> newNode = new Node<T>(newEntry);
                    newNode.setNextNode(current);
                    firstNode = newNode;
                    found = true;
                }
                current = current.next;
                currentIndex++;
            }
        }
        numberOfEntries++;
    }

    /**
     * Removes the first instance of the given object from the list
     *
     * @param obj
     *            the object to remove
     * @return true if successful
     */
    @Override
    public boolean remove(T obj) 
    {
        Node<T> current = firstNode;

        if ((null != firstNode) && (obj.equals(current.data))) 
        {
            firstNode = firstNode.next;
            numberOfEntries--;
            return true;
        }

        while (size() >= 2 && null != current.next) 
        {
            if ((obj.equals(current.next.data))) 
            {
                if (current.next.next != null) 
                {
                    current.setNextNode(current.next.next);
                }
                else
                {
                    current.setNextNode(null);
                }
                numberOfEntries--;
                return true;
            }
            current = current.next;
        }

        return false;
    }
    
    /**
     * Removes the object at the given position
     *
     * @param index
     *            the position of the object
     * @return true if the removal was successful
     * @throws IndexOutOfBoundsException
     *             if there is not an element at the index
     */
    public boolean remove(int index)
    {
        if (index < 0) 
        {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        } 
        else 
        {

            Node<T> current = firstNode;
            int currentIndex = 0;

            if ((0 == index) && (null != firstNode)) 
            {
                firstNode = firstNode.next;
                numberOfEntries--;
                return true;
            }

            while (null != current) 
            {
                if (index == currentIndex + 1) 
                {
                    Node<T> newNext = current.next.next;
                    current.setNextNode(newNext);
                    numberOfEntries--;
                    return true;
                }
                currentIndex++;
                current = current.next;
            }

            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    /** 
     * Removes all entries from this list. 
     */
    public void clear()
    {
        firstNode = null;
        numberOfEntries = 0;
    }

    /** 
     * Replaces the entry at a given position in this list.
     * @param index  An integer that indicates the position of
     *                       the entry to be replaced.
     * @param newEntry  The object that will replace the entry at the
     *                  position index.
     * @return  The original entry that was replaced.
     * @throws  IndexOutOfBoundsException if either
     *          index < 1 or index > size(). 
     */
    public T replace(int index, T newEntry)
    {
        if ((index >= 1) && (index <= numberOfEntries))
        {   
            Node<T> desiredNode = getNodeAt(index);
            T originalEntry = desiredNode.getData();
            desiredNode.setData(newEntry);
            return originalEntry;
        }
        else
        {
            throw new IndexOutOfBoundsException(
                    "Illegal position given to replace operation.");
        }
    }

    /** 
     * Retrieves the entry at a given position in this list.
     * @param index  An integer that indicates the position of
     *                       the desired entry.
     * @return  A reference to the indicated entry.
     * @throws  IndexOutOfBoundsException if either
     *          index < 1 or index > size(). 
     */
    public T getEntry(int index)
    {
        if ((index >= 1) && (index <= numberOfEntries))
        {
            return getNodeAt(index).getData();
        }
        else
        {
            throw new IndexOutOfBoundsException(
                    "Illegal position given to getEntry operation.");
        }
    }

    /** 
     * Retrieves all entries that are in this list in the order in which
     * they occur in the list.
     * @return  A newly allocated array of all the entries in the list.
     *          If the list is empty, the returned array is empty. 
     */
    public T[] toArray()
    {
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[numberOfEntries];

        int index = 0;
        Node<T> currentNode = firstNode;
        while ((index < numberOfEntries) && (currentNode != null))
        {
            result[index] = currentNode.getData();
            currentNode = currentNode.getNextNode();
            index++;
        } 
        return result;
    }
    
    /**
     * Gets the object at the given position
     *
     * @param index
     *            where the object is located
     * @return The object at the given position
     * @throws IndexOutOfBoundsException
     *             if no node at the given index
     */
    @Override
    public T get(int index) 
    {
        Node<T> current = firstNode;
        int currentIndex = 0;
        T data = null;
        
        while (null != current) 
        {
            if (index == currentIndex) 
            {
                data = current.data;
            }
            currentIndex++;
            current = current.next;
        }

        if (null == data) 
        {
            throw new IndexOutOfBoundsException("Index exceeds the size.");
        }
        return data;
    }

    /** 
     * Sees whether this list contains a given entry.
     * @param anEntry  The object that is the desired entry.
     * @return  True if the list contains anEntry, or false if not. 
     */
    public boolean contains(T anEntry)
    {
        boolean found = false;
        Node<T> currentNode = firstNode;

        while (!found && (currentNode != null))
        {
            if (anEntry.equals(currentNode.getData()))
            {
                found = true;
            }
            else
            {
                currentNode = currentNode.getNextNode();
            }
        } 

        return found;
    }

    /** 
     * Gets the length of this list.
     * @return  The integer number of entries currently in the list. 
     */
    public int size()
    {
        return numberOfEntries;
    }
    
    /** 
     * Sees whether this list is empty.
     * @return  True if the list is empty, or false if not. 
     */
    public boolean isEmpty()
    {
        boolean result;

        if (numberOfEntries == 0) 
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
    
    /**
     * @precondition The chain is not empty;
     *               1 <= index <= numberOfEntries.
     * @param index the position of the object
     * @return Returns a reference to the node at a given position.
     */
     private Node<T> getNodeAt(int index)
     {
         Node<T> currentNode = firstNode;

         for (int counter = 1; counter < index; counter++)
         {
             currentNode = currentNode.getNextNode();
         }

         return currentNode;
     }

    /**
     * Returns a string representation of the list 
     * @return a string representing the list
     */
    @Override
    public String toString() 
    {
        String result = "{";

        Node<T> current = firstNode;
        while (null != current) {
            result += "" + current.data;
            current = current.next;
            if (null != current) {
                result += ", ";
            }
        }
        result += "}";
        return result;
    }
}
