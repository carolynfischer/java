package lexicographicminimum;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author carry
 */
public class LexicographicMinimum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int k = in.nextInt();
        // initialize
        String smallest = S.substring(0, k);
        String largest = S.substring(0, k);
        for (int i = 0; i < S.length()-k+1; i++) {
            if (S.substring(i, i+k).compareTo(smallest) < 0) {
                smallest = S.substring(i, i+k);
            }
            if (S.substring(i, i+k).compareTo(largest) > 0) {
                largest = S.substring(i, i+k);
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }

}
