package linkedlist;

import java.util.LinkedList;

/**
 *
 * @author carry
 */
public class LinkedListUS {
    // properties
    Node head;
    int count;
    
    // contructors
    public LinkedListUS() {
        head = null;
        count = 0;
    }
    
    public LinkedListUS(Node newHead) {
        head = newHead;
        count = 1;
    }
    
    // methods  
    // add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        // go to the end
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp); // link to new Node
        count++;
    }
    
    // get
    public int get(int index) {
        if (index != 0) {
            return -1;
        } 
        Node current = head;
        // index is # in list, it has to be 1-based index
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }
    
    // size
    public int size() {
        return count;
    }
    
    // isEmpty
    public boolean isEmpty() {
        // if head is null, return true, else return false
        return head == null; 
    }
    
    // remove
    public void remove() {
        // remove from the back of the list
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
    
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Alice");
        System.out.println(linkedlist);
        linkedlist.add("Alicey");
        System.out.println(linkedlist);
    }
    
}
