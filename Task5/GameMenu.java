import java.util.ArrayList;
import java.util.Scanner;

// Task 4a: Creates the GameMenu class
class GameMenu {
    
    // Task 4b: A private instance variable of the type ArrayList<String>
    private ArrayList<String> actions = new ArrayList<>();

    // Task 4c + 4d: A constructor that takes ArrayList<String> and assigns it
    GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    // Task 4h: A method that displays all actions
    void displayMenu() {
        // A for-each loop that loops through the list and prints each action
        for (String action : actions) {
            System.out.println(action);
        }
    }

    // Task 5a–5c: Prompt the user, read input, and return it
    public String getAction() {
        System.out.println("Type a number to choose an action: ");
        displayMenu();

        // Step 5b: Create Scanner and read user input
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine(); // store user input

        // Step 5c: Return the user input
        return choice;
    }
}