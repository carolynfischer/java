package library;
import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 *
 * @author carry
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fine;
        int returnedDay = scan.nextInt();
        int returnedMonth = scan.nextInt();
        int returnedYear = scan.nextInt();
        scan.nextLine();
        int dueDay = scan.nextInt();
        int dueMonth = scan.nextInt();
        int dueYear = scan.nextInt();
        
        if (dueYear - returnedYear > 0) {
            fine = 0;
        } else if (returnedYear - dueYear > 0) {
            //System.out.println("year " +(returnedYear - dueYear));
            fine = 10000;
        } else if (returnedMonth - dueMonth > 0) {
            //System.out.println("month: " + (returnedMonth - dueMonth));
            fine = 500 * (returnedMonth - dueMonth);
        } else if (returnedDay > dueDay) {
            //System.out.println("Day: " + (returnedDay - dueDay));
            fine = 15 * (returnedDay - dueDay);
        } else {
            fine = 0;
        }
        System.out.println(fine);
    }

}
