import java.io.*;
import java.util.*;
/*
* author @carry
*/ 

public class PointsOfSymmetry {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            System.out.println(((2 * c) - a) + " " + ((2 * d) - b));
        }
    }
}
