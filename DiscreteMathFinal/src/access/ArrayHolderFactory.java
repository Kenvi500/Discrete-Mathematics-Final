package access;

import data.ComparableArrayHolder;

/**
 *
 * @author Kelvin Bonilla
 */
public class ArrayHolderFactory<T extends Comparable<T>> {
    
    public static <T extends Comparable<T>> ComparableArrayHolder<T> getCompareableArrayHolder()
    {
        return new ComparableArrayHolder<T>();
    }
    
    public static <T extends Comparable<T>> ComparableArrayHolder<T> getCompareableArrayHolder(int size)
    {
        return new ComparableArrayHolder<T>(size);
    }
        
}
