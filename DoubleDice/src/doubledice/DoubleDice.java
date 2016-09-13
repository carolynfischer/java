package doubledice;

import java.util.Scanner;

/**
 *
 * @author carry
 */
public class DoubleDice {
    static int antonina = 100;
    static int david = 100;
    
    public DoubleDice(){
    }
    
    public static void main(String[] args) {
        int antoninaThrow;
        int davidThrow;
        DoubleDice dice = new DoubleDice();
        
        Scanner scan = new Scanner(System.in).useDelimiter("[,\\s+]");
        int count = scan.nextInt();
        for (int i = count; i > 0; i--) {
            antoninaThrow = scan.nextInt();
            davidThrow = scan.nextInt();
            // if it's a tie, don't do anything
            if (antoninaThrow < davidThrow) {
                antonina -= davidThrow;
            } else if (antoninaThrow > davidThrow) {
                david -= antoninaThrow;
            }
        }
        System.out.println(antonina);
        System.out.println(david);
    }
    
}
