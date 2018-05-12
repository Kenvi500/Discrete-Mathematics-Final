package sourceCode.access;

import sourceCode.data.Algorithms;
import sourceCode.data.ComparableArrayHolder;

/**
 * Used to indirectly instantiate a ComparableArrayHolder of type T, where T extends Comparable.
 * Also used to access any other algorithms.
 * @author Kelvin Bonilla
 * @param <T> the data type that will be used by any functions that need it
 */
public abstract class DAO<T extends Comparable<T>> implements SAHIAccess<T>{
    /**
     * Static function that instantiates a ComparableArrayHolder of type T.
     * @param <T> the data type that the ComparableArrayHolder will be of
     * @return a ComparableArrayHolder of type T with the default size of 50 and casted to a SAHIAccess
     */
    public static <T extends Comparable<T>> SAHIAccess<T> getCompareableArrayHolder()
    {
        return (SAHIAccess) new ComparableArrayHolder<>();
    }
    
    /**
     * Static function that instantiates a ComparableArrayHolder of type T.
     * @param <T> the data type that the ComparableArrayHolder will be of
     * @param size the maximum number of elements this ComparableArrayHolder can have
     * @return a ComparableArrayHolder of type T with the size of "size" elements and casted to a SAHIAccess
     */
    public static <T extends Comparable<T>> SAHIAccess getCompareableArrayHolder(int size)
    // Precondition: size is a integer >1
    {
        return (SAHIAccess) new ComparableArrayHolder<>(size);
    }
    
    /**
     * Static function that calculates the greatest common divisor of integers a and b.
     * @param a the first non-negative integer
     * @param b the second non-negative integer
     * @return the greatest common divisor of the integers a and b
     */
    public static int gcd(int a, int b)
    // Precondition: int a and int b are non-negative integers
    {
        return Algorithms.greatestCommonDivisor(a, b);
    }
}
