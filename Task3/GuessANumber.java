import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    private static int rnd_number;

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {
        // Creates a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your guess: ");

        // uses hasNextDouble to check if input is numeric
        if (scanner.hasNextDouble()) {
            // Reads the user input
            double guess = scanner.nextDouble();

            // Compares it with the random number
            if (guess == rnd_number) {
                System.out.println("Correct, the number was " + rnd_number);
                return; // stops the recursion when correct
            } else if (guess < rnd_number) {
                System.out.println("Too low, please try again");
                makeAGuess(); // recursive call
            } else {
                System.out.println("Too high, please try again.");
                makeAGuess(); // recursive call
            }
        } else {
            // if input was not numeric show an error message
            System.out.println("That is not a number, please try again.");
            scanner.nextLine(); // discards the entire wrong line
            makeAGuess();       // recursive call
        }
    }
}