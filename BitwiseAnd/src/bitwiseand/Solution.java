package bitwiseand;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author carry
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n; 
        int k;
        int count = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < count; i++) {
            n = scan.nextInt();
            k = scan.nextInt();
            if (((k-1) | k) > n && k % 2 == 0) {
                System.out.println(k - 2);
            } else {
                System.out.println(k - 1);
            }
        }
    }

}
