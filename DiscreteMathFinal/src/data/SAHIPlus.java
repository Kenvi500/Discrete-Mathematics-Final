package data;

/**
 *
 * @author Kelvin Bonilla
 */
public interface SAHIPlus<T extends Comparable<T>> extends SortableArrayHolderInterface<T> 
{
    T max();
    void shuffle();
    public int indexOf(T element, SearchType searchType);
    public void delete(int index, boolean shift);
}
