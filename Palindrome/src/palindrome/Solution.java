package palindrome;
import java.io.*;
import java.util.*;

/**
 *
 * @author carry
 */
public class Solution {

    Stack<Character> stack = new Stack<Character>();
    Queue<Character> queue = new LinkedList<Character>() {};

    // push to stack
    public void pushCharacter(char c) {
        stack.push((Character) c);
    }
    
    // push to queue
    public void enqueueCharacter(char c) {
        queue.add(c);
    }
    
    // pop from stack
    public char popCharacter() {
        return stack.pop();
    }
    
    // pop from queue
    public char dequeueCharacter() {
        return queue.remove();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}