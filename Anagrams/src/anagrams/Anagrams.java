package anagrams;
import java.io.*;
import java.util.*;

/**
 *
 * @author carry
 */
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        boolean found = true;
        char[] aArray = a.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder(b.toLowerCase());
        if (a.length() != b.length()) {
            return false;
        }
        for (char c : aArray) {
            int index = sb.indexOf("" + c);
                if (index != -1) {
                    sb = sb.deleteCharAt(index);
                } else {
                    found = false;
                    break;
                }
        }
        return found;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
