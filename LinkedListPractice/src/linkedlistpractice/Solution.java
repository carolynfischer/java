package linkedlistpractice;

import java.util.Scanner;

/**
 *
 * @author carry
 */
public class Solution {

    public static Node insert(Node head, int data) {
        Node node = new Node(data);
        Node current = head;
        if (current != null) {
          while (current.next != null) {
              current = current.next;
          }
          current.next = node;
        } else {
            head = node;
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}