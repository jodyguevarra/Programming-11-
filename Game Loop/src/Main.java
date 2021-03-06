import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //Integrating scanner.
        Scanner scan = new Scanner(System.in);

            //Printing welcome + choice message.
        System.out.println("Choose rock, paper, or scissors. \n \'r\' for rock, \'p\' for paper, or \'s\' for scissors. \nTo exit, choose \'x\'.");

            //Setting changeable variables for wins and losses.
        int wins = 0;
        int losses = 0;

            //Looping the game.
        while (true) {
                //Printing divider + scoreboard.
            System.out.println("************************************** \nWins: " + wins + "\t Losses: " + losses + "\n");
                //Prompting player choice.
            System.out.print("Player's Choice: ");

                //Setting a variable to scan and collect the move made by the player.
            String humanMove = (scan.next());

                //Setting a variable to the random move generated by the computer.
            String computerMove = "";
                //Generating a random number from 0 to 3 and round into an integer for the possibilities of 0, 1, and 2.
            int random = (int)(Math.random()*3);
                //Assigning a corresponding letter, either r, p, or s, to the random numbers of 0, 1, and 2. This will change the computerMove variable to be whatever string it generates.
            if (random == 0) {
                computerMove = "r";
            }
            else if (random == 1) {
                computerMove = "p";
            }
            else {
                computerMove = "s";
            }

                //Presenting the possible results and printing the results for the player.
                    //If the player types 'x', then the game will stop running.
            if (humanMove.equals("x")) {
                System.out.println("Thanks for playing Rock, Paper, Scissors!");
                break;
            }
                    //If the player types anything else than the options provided, then the code will prompt a game renewal.
            else if (!humanMove.equals("r") && !humanMove.equals("p") && !humanMove.equals("s")) {
                System.out.println("Invalid selection. Please play again.");
            }
                    //If the player chooses the same move as the computer, the draw prompt will appear along with a layout of the moves made by each player.
            else if (humanMove.equals(computerMove)) {
                System.out.println("Draw! \n\nComputer Choice: " + computerMove + "\t\t" + "Player Choice: " + humanMove);
            }
                    //If the player wins, the win prompt will appear along with a layout of the moves made by each player. This will also add one point to the wins variable.
            else if (humanMove.equals("r") && computerMove.equals("s") || humanMove.equals("s") && computerMove.equals("p") || humanMove.equals("p") && computerMove.equals("r")) {
                System.out.println("You Win! \n\nComputer Choice: " + computerMove + "\t\t" + "Player Choice: " + humanMove);
                wins += 1;
            }
                    //If the player loses, the lose prompt will appear along with a layout of the moves made by each player. This will also add one point to the losses variable.
            else {
                System.out.println("You Lose! \n\nComputer Choice: " + computerMove + "\t\t" + "Player Choice: " + humanMove);
                losses += 1;
            }
        }

    }
}