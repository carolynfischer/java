package tictactoeapplication;

import java.util.Scanner;

/**
 *
 * @author carry
 */
public class TicTacToeApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // allows for continuous games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            // setting up tokens and AI
            System.out.println("Welcome to Tic Tac Toe! You are going to go "
                    + "against the master of Tic Tac Toe. Are you ready? I hope so!\n"
                    + " But first, you must pick which character you want to be and"
                    + " which I will be.");
        
        System.out.println();
        System.out.println("Enter a single character that will represent you on the board");
        char playerToken = scan.next().charAt(0);
        System.out.println("Enter a single character that will represent your opponent on the board");
        char opponentToken = scan.next().charAt(0);
        TicTacToe game = new TicTacToe(playerToken, opponentToken);
        AI ai = new AI();
        
        // set up the game
        System.out.println();
        System.out.println("Now we can start the game. To play, enter a number "
                + "and your token shall be put in its place.\n The numbers go"
                + " from 1-9, left to right. We shall see who will win this round.");
        TicTacToe.printIndexBoard();
        System.out.println();
        
        // let's play
        while (game.gameOver().equals("notOver")) {
            if (game.currentMarker == game.userMarker) {
                // user turn
                System.out.println("It's your turn! Enter a spot number for your token.");
                int spot = scan.nextInt();
                while (!game.playTurn(spot)) {
                    System.out.println("Try again. " + spot + " is invalid. This "
                            + "spot is already taken or it is out of range..");
                    spot = scan.nextInt();
                }
                System.out.println("You picked " + spot + "!");
            } else {
                // ai turn
                System.out.println("It's my turn!");
                // pick spot
                int aiSpot = ai.pickSpot(game);
                game.playTurn(aiSpot);
                System.out.println("I picked " + aiSpot + "!");
            }
            
            // print out game board
            System.out.println();
            game.printBooard();
        } // k
        System.out.println(game.gameOver());
        System.out.println();
        
        // set up a new game.. or not depending on the response
        System.out.println("Do you want to play again? Enter Y if you do, else"
                + " anything else if you are tired of me.");
        char response = scan.next().charAt(0);
        doYouWantToPlay = (response == 'Y');
        System.out.println();
        System.out.println();
        }
    }
}

