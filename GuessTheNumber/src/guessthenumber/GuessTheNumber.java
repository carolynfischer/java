package guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carry
 */
public class GuessTheNumber {

    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);
    
    public GuessTheNumber() {
        Random rand = new Random();
        max = 100;
        // get the number between 0 and max number
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
    }
    
    // static makes this a class method - don't need to create an instance to use this function
    public static void howBigIsMyNumber(int x) {
        if(x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range");
        }
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big");
            } else if (move < theNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("YOU GOT IT!");
                break;
            }
        }
    }    
    
    public static void main(String[] args) {
        // TODO code application logic here
//        howBigIsMyNumber(0);
//        howBigIsMyNumber(10);
//        howBigIsMyNumber(11);
//        howBigIsMyNumber(100);
//        howBigIsMyNumber(5);
//        howBigIsMyNumber(75);
//        howBigIsMyNumber(-1);
//        howBigIsMyNumber(105);
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Try to guess a number between 0 and " 
                + guessGame.max + " inclusive. Type a number to get started:");
        guessGame.play();
    }
    
}
