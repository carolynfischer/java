package currencyformatter;
import java.util.*;
import java.text.*;

/**
 *
 * @author carry
 * 
* Input Format
* A single double-precision number denoting payment

* Output Format
* On the first line, print US: u where u is payment formatted for US currency. 
* On the second line, print India: i where i is payment formatted for Indian currency. 
* On the third line, print China: c where c is payment formatted for Chinese currency. 
* On the fourth line, print France: f, where f is payment formatted for French currency.

* Sample Input
* 12324.134
* Sample Output
* US: $12,324.13
* India: Rs.12,324.13
* China: ￥12,324.13
* France: 12 324,13 €
 */
public class CurrencyFormatter {
    protected static String us;
    protected static String india;
    protected static String china;
    protected static String france;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("#.##");
        payment = Double.valueOf(df.format(payment));
        scanner.close();
        
        // number formats
        NumberFormat nfUs = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us = nfUs.format(payment);
        String india = nfIndia.format(payment);
        String china = nfChina.format(payment);
        String france = nfFrance.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " +  india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
