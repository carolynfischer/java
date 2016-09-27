package loopsformula;
/*
We use the integers a, b, and n to create the following series:
(a + 2^0), (a + 2^0*b + 2^1*b), ... ,(a + 2^0*b + 2^1*b + ... + 2^(n-1)*b)

You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of space-separated integers. 

*/
import java.util.*;
import java.io.*;

class LoopsFormula{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int sum = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            for (int k = 0; k < c; k++){
                sum += Math.pow(2, k) * b;
                System.out.print(a + sum + " ");
            }        
            System.out.println();
        }
        in.close();
    }
}
