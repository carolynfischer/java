package triangle;
import java.util.Scanner;
/**
 *
 * @author carry
 */
public class Triangle {

    public static void check(int first, int second, int third) {
        int sum = first + second + third;
        if (first == 60 && second == 60 && third == 60) {
            System.out.println("Equilateral");
        } else if (sum == 180) {
            if ((first == second && second == third) || (first == third && second == third)) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();
        
        check(first, second, third);
    }
    
}
