package recursiongoodluck;

/**
 *
 * @author carry
 */
public class RecursionGoodLuck {

    int result = 0;
    
    public static int Summation(int n) {
        if(n <= 0) {
            return 0;
        } else {
            return n + Summation(n-1);
        }
    }

    public static int Factorial(int n) {
        // base case
        if (n <= 1) { // 1 cause otherwise *0
            return 1;
        }  
        // recursive case
        else {
            return n * Factorial(n-1);
        }
    }
    
    public static int Exponentiation(int n, int p) {
        // base case
        if (p <= 0) {
            return 1;
        } 
        // recursive case
        else { 
            return n * Exponentiation(n, p-1);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Summation(5));
        System.out.println(Factorial(5));
        System.out.println(Exponentiation(5, 3));
    }
    
}
