package printinginput;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author carry
 */
public class PrintingInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int inputInteger;
        double inputDouble;
        String inputString;
        /* Read and save an integer, double, and String to your variables. */
        inputInteger = scan.nextInt();
        inputDouble = scan.nextDouble();
        scan.nextLine();
        inputString = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + inputInteger);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + inputDouble);
        /* Concatenate and print the String variables on a new line */
        System.out.println(s + inputString);
        /* The 's' variable above should be printed first. */

        scan.close();
    }
    
}
