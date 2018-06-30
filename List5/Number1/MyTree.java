
package OOPII.List5.Number1;

/**
 *
 * @author berse
 */
public class MyTree<T> implements Tree<T>{

    Node myNode;
    
    public MyTree(){
        myNode = new Node();
    }
    
    @Override
    public void clear() {        
    }

    @Override
    public Object exist(T value) {
        return null;
    }

    @Override
    public void createRoot(T value) {
    }
    
}
