import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String userName;
        System.out.println("Hello! What is your name?");
        try {
            userName = new Scanner(System.in).nextLine();  // Read user input
        } catch (Exception e) {
            System.out.println("!!error!!");
            return;
        }
        company.Guess game = new company.Guess(userName, (int) ((Math.random() * 100) % 20) + 1);
        while (1 == 1) {
            System.out.println("Well, " + userName + " I am thinking of a number between 1 and 20.");
            System.out.println("Take a guess.");
            while (game.play(new Scanner(System.in).nextInt()))
                System.out.println("Take a guess.");
            game.endGame((int) ((Math.random() * 100) % 20) + 1);
            System.out.println("Would you like to play again? (y or n)");
            String playing = "";
            try {
                playing = new Scanner(System.in).nextLine();
            } // Read user input
            catch (Exception e) {
                System.out.println("!!error!!");
                return;
            }
            if (playing.equals("n"))
                break;
        }
    }
}