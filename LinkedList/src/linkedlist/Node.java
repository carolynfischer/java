package linkedlist;

/**
 *
 * @author carry
 */
public class Node {
    // properties
    Node next;
    int data;
    
    // contructors
    public Node(int newData) {
        data = newData;
        next = null;
    }
    
    public Node(int newData, Node newNext) {
        data = newData;
        next = newNext;
    }
    
    // getters and setters
    public int getData() {
        return data;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setData(int newData) {
        data = newData;
    }
    
    public void setNext(Node newNode) {
        next = newNode;
    }
}
