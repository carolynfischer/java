import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
   
    public static void setAlphabet(String userInput) {
        int count = 0;
        String odd = "";
        String even = "";
        
        for (char ch: userInput.toCharArray()) {
            if(count % 2 == 0) {
                odd += ch;
            } else {
                even += ch;
            }
            count++;
        }
        System.out.println(odd + " " + even);
    }

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be nam0, ed Solution. */
	Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String userInput = scanner.nextLine();
            solution.setAlphabet(userInput);
        }
    }
}
