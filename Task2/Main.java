import java.util.Scanner;

// Task 2a: Main class with main method
class Main {
    public static void main(String[] args) {
        // Task 2c: Creates a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Task 2b: Asks the user to type their name
        System.out.print("Please type your name: ");

        // Task 2d: Saves the input into a String variable
        String name = scanner.nextLine();

        // Task 2e: Prints a greeting with the users name
        System.out.println("Hello " + name);

        // Task 2e Also asks for the users age
        System.out.print("Please type your age: ");

        // Task 2f: Saves the input into an int variable
        int age = scanner.nextInt();

        // Task 2g: Prints out the age
        System.out.println("You are " + age + " years old");

        // Task 2h: Calculates the years left until retirement
        int yearsLeft = 67 - age;

        // Task 2h: Prints the result
        System.out.println("You have " + yearsLeft + " years until retirement");
    }
}