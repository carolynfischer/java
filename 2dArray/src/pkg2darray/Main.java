/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int[][] hourGlass = new int[3][3];
        int maxValue = -1000;
        
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
       // System.out.println(Arrays.deepToString(arr));
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){

                int current = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {

                        hourGlass[k][l] = arr[i+k][j+l];

                        if(k == 1) {
                            if (l == 0 || l == 2) {
                                hourGlass[k][l] = 0;
                            } else {
                                hourGlass[k][l] = arr[i+k][j+l];
                                //System.out.println("i+k "+ (i+k)+ " j+k "+ (j+k));
                            }
                        }
                        //System.out.println("current " + current + " hg " + hourGlass[k][l]);
                        current = current + hourGlass[k][l];
                        //System.out.println(current);
                    }
                }
                //System.out.println("new starting point " + Arrays.deepToString(hourGlass));
                if (current > maxValue) {
                    maxValue = current;
                    //System.out.println("found new max"+ maxValue);
                }
            }

        }
        System.out.println(maxValue);
    }
}