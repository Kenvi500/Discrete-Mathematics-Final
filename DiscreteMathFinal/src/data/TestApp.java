package data;

import access.ArrayHolderFactory;
import java.util.Random;
import data.SortableArrayHolderInterface.*;

/**
 *
 * @author Kelvin Bonilla
 */
public class TestApp {
    public static void main(String[] args)
    {
        arrayHolderTest2();
        //insertionSortTest();
    }
    
    private static void insertionSortTest()
    {
        Integer[] someInts = new Integer[10];
        someInts[0] = 4;
        someInts[1] = 3;
        someInts[2] = 18;
        someInts[3] = 9;
        someInts[4] = 7;
        someInts[5] = 24;
        someInts[6] = 12;
        someInts[7] = 17;
        someInts[8] = 13;
        someInts[9] = 1;
        Algorithms.insertionSort(someInts);
        for (Integer someInt : someInts) {
            System.out.println(someInt);
        }
    }
    
    private static void arrayHolderTest() // also shows bubble sort being used
    {
        ComparableArrayHolder<Integer> theArray = new ComparableArrayHolder<>(10);
        Random r = new Random();
        for(int i = 0; i < theArray.size(); i++)
        {
            theArray.add(r.nextInt(100));
        }
        System.out.println("Current contents of the array holder:");
        System.out.println(theArray);
        
        theArray.sort(SortType.BUBBLE);
        
        System.out.println("\nCurrent contents of the array holder(after bubble sort):");
        System.out.println(theArray);
        
        System.out.println("\nMax of structure:");
        System.out.println(theArray.max());
        theArray.delete(0);
        
        System.out.println("\nCurrent contents of the array holder:");
        System.out.println(theArray);
        
        theArray.delete(1, true);
        
        System.out.println("\nCurrent contents of the array holder:");
        System.out.println(theArray);
    }
    
    private static void arrayHolderTest2()
    {
        SAHIPlus<Integer> array = ArrayHolderFactory.getCompareableArrayHolder(10);
        for(int i = 10; i > 0; i--)
            array.add(i);
        System.out.println(array);
        System.out.println();
        System.out.println("\nSorting with Bubble Sort...");
        array.sort(SortType.BUBBLE);
        System.out.println(array);
        System.out.println("\nShuffling...");
        array.shuffle();
        System.out.println(array);
        System.out.println("\nSorting with Insertion Sort...");
        array.sort(SortType.INSERTION);
        System.out.println(array);
    }
    
}
