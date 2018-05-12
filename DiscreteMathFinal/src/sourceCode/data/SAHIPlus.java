package sourceCode.data;

/**
 * Declares a SortableArrayHolder with some additional properties.
 * @author Kelvin Bonilla
 * @param <T> the data type of this SortableArrayHolder. T must extend Comparable.
 */
public interface SAHIPlus<T extends Comparable<T>> extends SortableArrayHolderInterface<T> 
{
    /**
     * Enumeration for the type of searches available.
     */
    public enum SearchType{
        LINEAR,BINARY
    }
    
    /**
     * The maximum function, which gets the maximum value of this SAHIPlus.
     * @return the maximum of this SAHIPlus
     */
    T max();
    
    /**
     * Gets index of an element with the search type given.
     * @param element the element whose index is to be searched for
     * @param searchType the type of search to do
     * @return the index of the element, or an indication that it wasn't found
     */
    public int indexOf(T element, SearchType searchType);
    
    /**
     * * Deletes the element at index position, and allows the user to shift the values so the values of the structure are sequential with empty spaces at the end of the cluster.
     * @param index the index position of the element to delete
     * @param shift a boolean value indicating whether or not user wishes to shift array to eliminate all null values
     */
    public void delete(int index, boolean shift);
    // Precondition: index is within the bounds of this SAHIPlus (0, SAHIPlus.size() - 1)
}
