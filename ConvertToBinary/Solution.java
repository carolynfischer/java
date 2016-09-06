import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        String binary = Integer.toBinaryString(decimal);
        int count = 0;
        int max = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (Character.getNumericValue(binary.charAt(i)) == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}
