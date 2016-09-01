import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int arrayLength = arr.length;
        String arrayString = "";
        for (int x = arrayLength-1; x >= 0; x--) {
            arrayString += arr[x] + " ";
        }
        System.out.println(arrayString);
    }
}