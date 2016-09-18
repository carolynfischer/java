package hangmanapplication;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author carry
 */
public class HangmanApplication {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to hangman! I will pick a word and you will "
                + "try to guess it. \nIf you guess wrong, 6 times, then I win. If you"
                + " can guess it before then, then you win. Are you ready? I hope "
                + "so because I am.");
        System.out.println();
        System.out.println("I have picked my word, below is a picture and below "
                + "that is your current guess, which starts off as nothing. \nEvery "
                + "time you guess incorrectly, I add a body part to the picture."
                + "\nWhen there is a full person, you lose.");
        
        // allows you to play multiple games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            // setting up the game
            System.out.println();
            System.out.println("Alright! Let's play!");
            Hangman game = new Hangman();
            
            do {
                // draw the things
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord);
                System.out.println();
              
                // get the guess
                System.out.println("Enter a character that you think is in the word.");
                char guess = (scan.next().toLowerCase()).charAt(0);
                System.out.println();

                // check if the character is guessed already
                while (game.isGuessedAlready(guess)) {
                    System.out.println("Try again! You've already guessed the character.");
                    guess = (scan.next().toLowerCase()).charAt(0);
                }

                // play the guess
                if (game.playGuess(guess)) {
                    System.out.println("Great guess! That character is in the word.");
                } else {
                    System.out.println("Unfortunately that character isn't in the word.");
                } 
            } while (!game.gameOver()); // keep playing until the game is over
            
            // play again or no?
            System.out.println();
            System.out.println("Do you want to play another game? Enter Y if you do.");
            Character response = (scan.next().toUpperCase()).charAt(0);
            doYouWantToPlay = (response == 'Y');           
        }
    }

}
