/* Sample input:
12.00
20
8
*/
package mealcost;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author carry
 */
public class MealCost {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tipValue = mealCost * (tipPercent / 100.00);
        double taxValue = mealCost * (taxPercent / 100.00);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + tipValue + taxValue);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
    
}
