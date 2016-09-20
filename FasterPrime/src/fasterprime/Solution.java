package fasterprime;
import java.io.*;
import java.util.*;
/**
 *
 * @author carry
 */
public class Solution {
    
    public static boolean prime(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        // loop over inputs
        for (int i = 0; i < count; i++) {
            boolean answer = prime(scan.nextInt());
            if (answer) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }       
        
    }

}
