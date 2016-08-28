package cointoss;
import java.util.Random;

/**
 *
 * @author carry
 */
public class CoinToss {

    public int tossACoin() {
        Random rand = new Random();
        // Absolute value from a math class, feed in a random value and mod 2 (0 or 1).
        int toss = Math.abs(rand.nextInt()) % 2;
        return toss;
    }
        
    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        int toss = game.tossACoin();
        if(toss == 0) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
    
}
