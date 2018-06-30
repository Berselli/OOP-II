
package OOPII.List5.Number1;

/**
 *
 * @author berse
 */
public class Node<T> {
    
    T value;
    
    public Node(){
        value = (T) new Object();
    }
    
    
    // The current node creates a child node and returns a reference to the new node.
    public Object addChild(T value){
        return null;
    }
    
    //remove the child node with specific name
    public boolean removeChild(T value){
        return false;
    }
}
