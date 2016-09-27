package getdayofweek;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author carry
 */
public class Solution {

// java.time is not allowed for this challenge
//    public static void convertToDay(String month, String day, String year) {
//        String strDate = year + "-" + month + "-" + day;
//        LocalDate formatted = LocalDate.parse(strDate);
//        System.out.println(formatted.getDayOfWeek());        
//    }
    
    public static void convertToDay(String month, String day, String year) {
        try {
            Calendar c = Calendar.getInstance();
            String str = month + " " + day + " " + year;
            DateFormat formatter = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
            Date date = formatter.parse(str);
            c.setTime(date);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
            day = simpleDateFormat.format(date).toUpperCase();
            System.out.println(day);
        } catch (Exception e) {
            System.out.println("could not parse date");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        convertToDay(month, day, year);
    }

}
