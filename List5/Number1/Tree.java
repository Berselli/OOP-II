
package OOPII.List5.Number1;

/**
 *
 * @author berse
 */
public interface Tree<T> {
    
    //clear nodes
    public void clear();
    
    //search if have the value in the node and return the reference of this.
    public Object exist(T value);
    
    //add root
    public void createRoot(T value);
    
}
