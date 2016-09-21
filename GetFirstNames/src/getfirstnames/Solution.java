package getfirstnames;
import java.io.*;
import java.util.*;

/**
 *
 * @author carry
 */

public class Solution {

    public static String[] removeNull(String[] a) {
        ArrayList<String> removed = new ArrayList<String>();
        for (String str : a)
           if (str != null)
              removed.add(str);
        return removed.toArray(new String[0]);
     }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        String line;
        String name;
        String[] names = new String[count];
        scan.nextLine();
        int j = 0;
        for (int i = 0; i < count; i++) {
            line = scan.nextLine();
            name = line.split("\\s")[0];
            if (line.matches(".*@gmail.com.*")) {
                names[j] = name;
                j++;
            }
        }
        names = removeNull(names);
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}