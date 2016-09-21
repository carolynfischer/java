package arrivingstudents;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author carry
 * https://www.hackerrank.com/challenges/30-testing
 */

public class Tests {
    
    public static String solve(int students, int treshold, int[] arrivals) {        
        String result;
        int present = 0;
        for (int j = 0; j < students; j++) {
            if (arrivals[j] <= 0) {
                present += 1;
            }
        }
        //System.out.println("present " + present + " from required " + treshold + " " + Arrays.toString(arrivals));
        if (present >= treshold) {
            //System.out.println("NO");
            result = "no";
        } else {
            //System.out.println("YES");
            result = "yes";
        }
        return result;
    }
    
    public static int generateNumber(int bound) {
        Random rand = new Random();
        return rand.nextInt(bound);
    }
    
    public static boolean search(int[] arrivals, int number) {
        boolean found = false;
        for (int i = 0; i < arrivals.length; i++) {
            if (arrivals[i] == number) {
                found = true;
                break;
            }
        }
        return found;
    }
    
    public static void printOutput(int students, int treshold, int[] arrivals) {
        System.out.println(students + " " + treshold);
        for (int k = 0; k < arrivals.length; k++) {
            System.out.print(arrivals[k] + " ");
        }
        System.out.println();
    }
    
    public static int[] generateTests() {
            int students = generateNumber(20) + 3;
            int treshold = generateNumber(students - 1) + 2;

            int[] arrivals = new int[students];
            int[] output;
            int j = 0;
            boolean added = false;
            while (j < students) {
                if (j < (students / 3)) {
                    int toAdd = (generateNumber(20) + 2) * -1;
                    while (search(arrivals, toAdd)) {
                        toAdd = (generateNumber(20) + 2) * -1;
                    }
                    arrivals[j] = toAdd;
                    j++;
                } else if (!added) {
                    arrivals[j] = 0;
                    added = true;
                    j++;
                } else {
                    int toAdd = generateNumber(20) + 2;
                    while (search(arrivals, toAdd)) {
                        toAdd = generateNumber(20) + 2;
                    }
                    arrivals[j] = toAdd;
                    j++;
                }
            }
            output = new int[2 + students];
            output[0] = students;
            output[1] = treshold;
            for (int k = 0; k < arrivals.length; k++) {
                output[k+2] = arrivals[k];
            }
            return output;
    }
    
    public static void runTests() {
        Random rand = new Random();
        int testCases = 5;
        String[] results = {"yes", "no", "yes", "no", "yes"};
        System.out.println(testCases);
        for (int i = 0; i < testCases; i++) {
            int[] output = generateTests();
            int students = output[0];
            int treshold = output[1];
            int[] arrivals = Arrays.copyOfRange(output, 2, output.length);
            while (!results[i].equals(solve(students, treshold, arrivals))) {
                output = generateTests();
                students = output[0];
                treshold = output[1];
                arrivals = Arrays.copyOfRange(output, 2, output.length);
            };
            //System.out.println(results[i] + " was the same as solve " + solve(students, treshold, arrivals));
            printOutput(students, treshold, arrivals);
        }
    }

    public static void main(String[] args) {
        runTests();
    }
}
