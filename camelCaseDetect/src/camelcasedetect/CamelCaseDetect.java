package camelcasedetect;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author carry
 */
public class CamelCaseDetect {

    public static void main(String[] args) {
        int count = 1;
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String regEx = "([A-Z])";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find())
            count++;
        System.out.println(count);
    }
    
}
