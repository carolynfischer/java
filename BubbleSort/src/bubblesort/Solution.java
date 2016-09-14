/*
 * Copyright 2016 Carolyn Van Spyk
 */

package bubblesort;
import java.io.*;
import java.util.*;
/**
 *
 * @author carry
 */
public class Solution {

    public static int[] a = new int[600];

    public Solution() {
    }
    
    private int sort(int n) {
        int totalSwaps = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    //System.out.println("comparing " + a[j] + " " + a[j+1]);
                    swap(j, j+1);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            } else {
                totalSwaps += numberOfSwaps;
            }
        }

        return totalSwaps;
    }
    
    private void swap(int i, int j) {
        //System.out.println("i " + a[i] + " j " + a[j]);
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
        
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < count; i++) {
            a[i] = scan.nextInt();
        }
        int swaps = solution.sort(count);
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[count-1]);
    }

}
