package src;

/**
 *
 * @author Kelvin Bonilla
 */
public interface SortableArrayHolderInterface<T extends Comparable<T>> extends ArrayHolderInterface<T> {
    public enum SearchType{
        LINEAR,BINARY
    }
    
    public enum SortState{
        SORTED,UNSORTED;
    }
    
    public enum SortType{
        BUBBLE,INSERTION;
    }
    
    void sort(SortType st);
}
