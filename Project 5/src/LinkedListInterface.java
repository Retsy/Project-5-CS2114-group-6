/** 
 * An interface for the ADT list.
 * Entries in a list have positions that begin with 1.
 * 
 * @author Frank M. Carrano
 * @author Haokun Liu
 * @version 2016.08. 06
 */

public interface LinkedListInterface<T>
{
    /** 
     * Adds a new entry to the end of this list.
     * Entries currently in the list are unaffected.
     * The list's size is increased by 1.
     * @param newEntry  The object to be added as a new entry. 
     */
    public void add(T newEntry);

    /** 
     * Adds a new entry at a specified position within this list.
     * Entries originally at and above the specified position
     * are at the next higher position within the list.
     * The list's size is increased by 1.
     * @param newPosition  An integer that specifies the desired
     *                     position of the new entry.
     * @param newEntry     The object to be added as a new entry.
     * @throws  IndexOutOfBoundsException if either
     *          newPosition < 1 or newPosition > getLength() + 1. 
     */
    public void add(int newPosition, T newEntry);
    
    /**
     * Removes the first instance of the given object from the list
     *
     * @param obj  the object to remove
     * @return true if successful
     */
    public boolean remove(T obj);

    /**
     * Removes the object at the given position
     *
     * @param index the position of the object
     * @return true if the removal was successful
     * @throws IndexOutOfBoundsException
     *             if there is not an element at the index
     */
    public boolean remove(int index);

    /** 
     * Removes all entries from this list. 
     */
    public void clear();

    /** 
     * Replaces the entry at a given position in this list.
     * @param givenPosition  An integer that indicates the position of
     *                       the entry to be replaced.
     * @param newEntry  The object that will replace the entry at the
     *                  position givenPosition.
     * @return  The original entry that was replaced.
     * @throws  IndexOutOfBoundsException if either
     *          givenPosition < 1 or givenPosition > getLength(). 
     */
    public T replace(int givenPosition, T newEntry);

    /** 
     * Retrieves the entry at a given position in this list.
     * @param givenPosition  An integer that indicates the position of
     *                       the desired entry.
     * @return  A reference to the indicated entry.
     * @throws  IndexOutOfBoundsException if either
     *          givenPosition < 1 or givenPosition > getLength(). 
     */
    public T getEntry(int givenPosition);

    /** 
     * Retrieves all entries that are in this list in the order in which
     * they occur in the list.
     * @return  A newly allocated array of all the entries in the list.
     *          If the list is empty, the returned array is empty. 
     */
    public T[] toArray();
    
    /**
     * Gets the object at the given position
     *
     * @param index
     *            where the object is located
     * @return The object at the given position
     * @throws IndexOutOfBoundsException
     *             if there is not a node at the given index
     */
    public T get(int index);

    /** 
     * Sees whether this list contains a given entry.
     * @param anEntry  The object that is the desired entry.
     * @return  True if the list contains anEntry, or false if not. 
     */
    public boolean contains(T anEntry);

    /** 
     * Gets the length of this list.
     * @return  The integer number of entries currently in the list. 
     */
    public int size();
    
    /** 
     * Sees whether this list is empty.
     * @return  True if the list is empty, or false if not. 
     */
    public boolean isEmpty();
}
