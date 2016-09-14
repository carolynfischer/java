package queuey;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author carry
 */
public class Queuey<D> {

    LinkedList<D> queue = new LinkedList();
    
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
    public void enqueue(D n) {
        queue.addLast(n);
    }
    
    // dequeueing an item
    public D dequeue() {
        return queue.remove(0);
    }
    
    
    // peek at the first item
    public D peek() {
        return queue.get(0);
    }
    
    public static void main(String[] args) {
          // Number Queue
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Peek at second item " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());
        
        // String Queue
        Queuey stringQueue = new Queuey();
        stringQueue.enqueue("hi");
        stringQueue.enqueue("there");
        System.out.println(stringQueue.dequeue() + " ");
        System.out.println(stringQueue.dequeue() + " ");

        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");
        System.out.println(stacky.pop() + " ");
        System.out.println("Peek: " + stacky.peek());
        System.out.println(stacky.pop() + "!");
        System.out.println("Size " + stacky.size());
//        Queue<String> queue = new Queue<>();
//        queue.add("hi");
    }
    
}
