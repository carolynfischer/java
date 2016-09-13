package votecount;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author carry
 */
public class VoteCount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int count = scan.nextInt();
        scan.nextLine();
        String input = scan.nextLine();
        char[] s = input.toCharArray();

        for (char c : s) {
            if (c == 'A' || c == 'a') {
                a++;
            } else if (c == 'B' || c == 'b') {
                b++;
            }
        }
        
        if (a > b) {
            System.out.println("A");
        } else if (a < b) {
            System.out.println("B");
        } else if (a == b) {
            System.out.println("Tie");
        }
    }
    
}
