package sourceCode.data;

/**
 * Declares an ArrayHolder that can be sorted.
 * @author Kelvin Bonilla
 * @param <T> the data type of this ArrayHolder. T must extend Comparable.
 */
public interface SortableArrayHolderInterface<T extends Comparable<T>> extends ArrayHolderInterface<T> {
    
    /**
     * Enumeration for the sort states available.
     */
    public enum SortState{
        SORTED,UNSORTED;
    }
    
    /**
     * Enumerations for the type of sorts available.
     */
    public enum SortType{
        BUBBLE,INSERTION;
    }
    
    /**
     * Sorts this SortableArrayHolder using the SortType given.
     * @param st the type of sort to apply on the SortableArrayHolder 
     */
    void sort(SortType st);
    
    /**
     * Gets current SortState.
     * @return a SortState type indicating the current sort state of this SortableArrayHolder
     */
    public SortState getCurSortState();
}
