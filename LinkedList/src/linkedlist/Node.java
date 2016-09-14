package linkedlist;

/**
 *
 * @author carry
 */
public class Node<D> {
    // properties
    Node<D> next;
    D data;
    
    // contructors
    public Node(D newData) {
        data = newData;
        next = null;
    }
    
    public Node(D newData, Node newNext) {
        data = newData;
        next = newNext;
    }
    
    // getters and setters
    public D getData() {
        return data;
    }
    
    public Node<D> getNext() {
        return next;
    }
    
    public void setData(D newData) {
        data = newData;
    }
    
    public void setNext(Node<D> newNode) {
        next = newNode;
    }
}
