package src;

/**
 *
 * @author Kelvin Bonilla
 */
public interface ArrayHolderInterface<T> {
                
    int size();
    
    T get(int index);
    
    void delete(int index);
    
    void add(T element);
    
    int indexOf(T element);
    
    T max();
    
    String toString();
}
