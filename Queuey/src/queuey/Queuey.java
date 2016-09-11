package queuey;

import java.util.LinkedList;

/**
 *
 * @author carry
 */
public class Queuey {

    LinkedList queue = new LinkedList();
    
    // making a queue instance
    public Queuey() {
        queue = new LinkedList();
    }
    
    // is our queue empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    // what is the size of our queue
    public int size() {
        return queue.size();
    }
    
    // enqueueing an item
    public void enqueue(int n) {
        queue.addLast(n);
    }
    
    // dequeueing an item
    public int dequeue() {
        return (int) queue.remove(0);
    }
    
    
    // peek at the first item
    public int peek() {
        return (int) queue.get(0);
    }
    
    public static void main(String[] args) {
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Peek at second item " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());
    }
    
}
