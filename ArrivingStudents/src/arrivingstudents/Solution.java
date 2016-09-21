package arrivingstudents;
import java.io.*;
import java.util.*;
/**
 *
 * @author carry
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        scan.nextLine();
        int students;
        int[] arrivals;
        int treshold;
        int present;
        
        for (int i = 0; i < count; i++) {
            present = 0;
            students = scan.nextInt();
            treshold = scan.nextInt();
            arrivals = new int[students];
            scan.nextLine();
            for (int j = 0; j < students; j++) {
                arrivals[j] = scan.nextInt();
                if (arrivals[j] <= 0) {
                    present += 1;
                }
            }
            scan.nextLine();
            System.out.println(Arrays.toString(arrivals));
            System.out.println("present " + present);
            if (present <= treshold) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
