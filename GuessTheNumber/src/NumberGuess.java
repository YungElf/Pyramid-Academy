import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * (20 - 1)) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + " , Welcome to the number guessing game.\n");

        String again = "y";
        while (again.equals("y")){
            System.out.println("I am thinking of a number between 1 and 20. Please take a guess");
            int count = 0;
            while (count < 6) {
                int guess = scanner.nextInt();
                if (guess < randomNum) {
                    System.out.println("Your guess is too low. Please try again.");
                    count = count + 1;
                } else if (guess > randomNum) {
                    System.out.println("Your guess is too high. Please try again.");
                    count = count + 1;
                } else {
                    System.out.println("You are correct. It only took you " + count + " tries!");
                    break;
                }
            }
            System.out.println("Would you like to play again? y or n");
            again = scanner.next();
        }
    }
} 