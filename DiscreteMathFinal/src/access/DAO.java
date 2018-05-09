package access;

import data.Algorithms;
import data.ComparableArrayHolder;
import data.SAHIPlus;
import java.util.Random;

/**
 *
 * @author Kelvin Bonilla
 */
public class DAO<T extends Comparable<T>> {
    
    public static <T extends Comparable<T>> ComparableArrayHolder<T> getCompareableArrayHolder()
    {
        return new ComparableArrayHolder<T>();
    }
    
    public static <T extends Comparable<T>> ComparableArrayHolder<T> getCompareableArrayHolder(int size)
    {
        return new ComparableArrayHolder<T>(size);
    }
    
    public static int gcd(int a, int b)
    {
        return Algorithms.greatestCommonDivisor(a, b);
    }
}
