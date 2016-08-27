package timestable;

import java.io.*;
import java.util.*;
import java.util.Scanner;


/**
 *
 * @author carry
 */
public class TimesTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(inputInt + " x " + i + " = " + inputInt * i);
        }    
    }
    
}
