package sourceCode.data;

/**
 * Defines a ComparableArrrayHolder that implements the sourceCode.access.SAHIAccess. SAHIAccess extends all interfaces found in sourceCode.data. 
 * @author Kelvin Bonilla
 * @param <T> the data type of this ComparableArrayHolder. T must extend Comparable.
 */
public class ComparableArrayHolder<T extends Comparable<T>> implements sourceCode.access.SAHIAccess<T> {
    private T[] array;     // underlying array
    private int lastIndex; // recent index position with data
    private SortState curSortState;
    
    private static int DEF_CAP = 50; // default capacity of a ComparableArrayHolder
    
    /**
     * Constructor for this ComparableArrayHolder which manually takes in the size.
     * @param size the size of this ComparableArrayHolder
     */
    public ComparableArrayHolder(int size){
        array = (T[]) new Comparable[size];
        lastIndex = -1;
        curSortState = SortState.UNSORTED;
    }
    
    /**
     * Default constructor with a default capacity of 50.
     */
    public ComparableArrayHolder(){
        this(DEF_CAP);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int size(){
        return array.length;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public T get(int index){
        return array[index];
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(int index){
        this.delete(index, false);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(int index, boolean shift){
        if(shift){
            array[index] = null;
            T[] copy = (T[]) new Comparable[this.size()];
            int counter = 0;
            for(int i = 0; i < this.size(); i++){
                if(array[i] != null){
                    copy[counter] = array[i];
                    counter++;
                }
            }
            array = copy;
        }
        else
            array[index] = null;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void add(T element){
        array[++lastIndex] = element;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int indexOf(T element)
    {
        return indexOf(element, SearchType.LINEAR);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int indexOf(T element, SearchType searchType)
    // Precondition: Data has already been sorted (if using SearchType.BINARY)
    {
        if(searchType == SearchType.BINARY)
            return Algorithms.binarySearch(array, element);
        else
            return Algorithms.linearSearch(array, element);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void sort(SortType st)
    {
        if(st == SortType.BUBBLE)
            Algorithms.bubbleSort(array);
        else if(st == SortType.INSERTION)
            Algorithms.insertionSort(array);
        curSortState = SortState.SORTED;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString(){
        String toReturn = "[";
        for(int i = 0; i <= lastIndex; i++)
        {
            if(i != lastIndex)
                toReturn += array[i] + ",";
            else
                toReturn += array[i] + "]";
        }
        return toReturn;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public T max(){
        return Algorithms.max(array);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public SortState getCurSortState() {
        return curSortState;
    }
    
}
