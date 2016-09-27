package parallelogram;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author carry
 * https://www.hackerrank.com/challenges/java-static-initializer-block
 */
public class Solution {

    public static boolean flag;
    public static int B;
    public static int H;
    
    static {
        try {
            Scanner in = new Scanner(System.in);
            B = in.nextInt();
            H = in.nextInt();
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            } else {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }
	} //end of main
} //end of class
