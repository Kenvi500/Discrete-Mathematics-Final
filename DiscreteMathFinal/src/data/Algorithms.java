package data;

/**
 *
 * @author Kelvin Bonilla
 */
public class Algorithms {
    
    /**
     * @param <T extends Comparable<T>> arguments must extend the Comparable interface
     * @param theArray whose max value is wanted
     * @return the maximum value of the structure
     */
    public static <T extends Comparable<T>> T max(T[] theArray)
    // Precondition:  Structure is not empty
    //                Structure (and its elements) implement Comparable
    {
        T max = theArray[0];
        for(int i = 1; i < theArray.length; i++)
        {
            if(max.compareTo(theArray[i]) <= 0)
            {
                max = theArray[i];
            }    
        }
        return max;
    }
    
    
    /**
     * 
     * @param <T extends Comparable<T>> arguments must extend the Comparable interface
     * @param theArray that will be used in the linear search
     * @param element whose subscript is to be found in theArray
     * @return the current subscript to the element found in the structure, or -1 indicating no such value was found
     */
    public static <T extends Comparable<T>> int linearSearch(T[] theArray, T element)
    // Precondition: Strucutre is not empty
    {
        int i = 0;
        int location = 0;
        while(i <= theArray.length - 1 && element.compareTo(theArray[i]) != 0)
        {
            i++;
            if(i <= theArray.length - 1)
                location = i;
            else
                location = -1;
        }
        return location;
    }
    
    /**
     * 
     * @return the current subscript to the element found in the structure, or -1 indicating no such value was found
     */
    public static <T extends Comparable<T>> int binarySearch(T[] theArray, T element)
    // Preconditions: Structure is not empty
    //                Structure has been sorted in ascending value
    {
        int i = 0;
        int j = theArray.length - 1;
        int m = -1;
        int location = -1;
        while(i < j)
        {
            m = (i + j)/2;
            if(element.compareTo(theArray[m]) > 0)
                i = m + 1;
            else if(element.compareTo(theArray[m]) == 0)
            {
                location = m;
                return location;
            }
            else
                j = m;            
        }        
        return location;
    }
    
    /**
     * 
     * @param <T extends Comparable<T>> arguments must extend the Comparable interface
     * @param theArray to be sorted using the bubble sort algorithm, sorts in ascending order
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] theArray)
    // Preconditions: Structure is not empty
    //                Structure has no null values, or null values are accounted for in such a way that objectInArray.compareTo(null) returns -1, 0, or 1
    {
        T val;
        for(int i = 0; i < theArray.length - 1; i++)
            for(int j = 0; j < theArray.length - 1 - i; j++)
                if(theArray[j].compareTo(theArray[j + 1]) > 0)
                {
                    val = theArray[j];
                    theArray[j] = theArray[j + 1];
                    theArray[j + 1] = val;
                }
    }
    
    public static <T extends Comparable<T>> void insertionSort(T[] theArray)
    {        
        T temp;
        for(int j = 1; j < theArray.length; j++)
        {
            int i = 0;
            while(theArray[j].compareTo(theArray[i]) > 0)
            {
                i++;
            }
            temp = theArray[j];
            for(int k = 0; k < (j - i); k++)
                theArray[j - k] = theArray[j - k - 1];
            theArray[i] = temp;
        }
            
    }
    
    public static int greatestCommonDivisor(int a, int b)
    // Precondition: Both a and b are non-negative integers
    {
        if(a == 0)
            return b;
        else if(b == 0)
            return a;
        else if(a == b)
            return a;
        else
        {
            if (a < b) 
            {
                while (b != 0) 
                {
                    int remainder = a % b;
                    a = b;
                    b = remainder;
                }
                return a;
            } 
            else if (b < a) 
            {
                while (a != 0) 
                {
                    int remainder = b % a;
                    b = a;
                    a = remainder;
                }
                return b;
            }
        }
        return 0; // shouldn't get here
    }
}
