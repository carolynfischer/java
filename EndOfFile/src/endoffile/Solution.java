package endoffile;
import java.io.*;
import java.util.*;

/**
 *
 * @author carry
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = 0;
        while (in.hasNext() == true) {
            rows += 1;
            System.out.println(rows + " " + in.nextLine());
        }
        in.close();
    }

}
