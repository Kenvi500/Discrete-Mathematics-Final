package data;

import java.util.Random;

/**
 * NOTES: CONSIDER ADDING ERROR CHECKING
 *        CREATE SAHPLUS WHICH WILL HAVE MAX, SHUFFLE, ETC. AND EXTENDS SAHI 
 * @author Kelvin Bonilla
 */
public class ComparableArrayHolder<T extends Comparable<T>> implements SAHIPlus<T> {
    private T[] array;
    private int lastIndex; // recent index position with data
    private SortState curSortState;
    
    private static int DEF_CAP = 50; // default capacity of an array
    
    /**
     * 
     * @param size 
     */
    public ComparableArrayHolder(int size){
        array = (T[]) new Comparable[size];
        lastIndex = -1;
        curSortState = SortState.UNSORTED;
    }
    /**
     * 
     */
    public ComparableArrayHolder(){
        this(DEF_CAP);
    }
    /**
     * 
     * @return 
     */
    @Override
    public int size(){
        return array.length;
    }
    /**
     * 
     * @param index
     * @return 
     */
    @Override
    public T get(int index){
        return array[index];
    }
    /**
     * 
     * @param index 
     */
    @Override
    public void delete(int index){
        this.delete(index, false);
    }
    /**
     * 
     * @param index
     * @param shift 
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
     * 
     * @param element 
     */
    @Override
    public void add(T element){
        array[++lastIndex] = element;
    }
    /**
     * 
     * @param element
     * @return 
     */
    @Override
    public int indexOf(T element){
        return indexOf(element, SearchType.BINARY);
    }
    /**
     * 
     * @param element
     * @param searchType
     * @return 
     */
    @Override
    public int indexOf(T element, SearchType searchType){
        if(searchType == SearchType.BINARY && curSortState == SortState.SORTED)
            return Algorithms.binarySearch(array, element);
        else
            return Algorithms.linearSearch(array, element);
    }
    /**
     * 
     * @param st 
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
     * 
     */
    @Override
    public void shuffle(){
        shuffleArray(array);
    }
    /**
     * 
     * @param toShuffle 
     */
    private void shuffleArray(T[] toShuffle) {
        int n = toShuffle.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(toShuffle, i, change);
        }
    }
    /**
     * 
     * @param toShuffle
     * @param index1
     * @param index2 
     */
    private void swap(T[] toShuffle, int index1, int index2) {
        T temp = toShuffle[index1];
        toShuffle[index1] = toShuffle[index2];
        toShuffle[index2] = temp;
    }        
    /**
     * 
     * @return 
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
     * 
     * @return 
     */
    @Override
    public T max(){
        return Algorithms.max(array);
    }
    
}
