import java.util.ArrayList;

// Task 4e: Creates the Main class with a main method
class Main {
    public static void main (String[] args) {

        // Task 4f: Creates an ArrayList<String> called actions
        ArrayList<String> actions = new ArrayList<>();

        // Task 4f: Adds four actions to the list
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        // Test: prints element at index 2 which is = "3) Pause game"
        // System.out.println(actions.get(2));

        // Task 4g: Creates a GameMenu object and passes the actions list
        GameMenu menu = new GameMenu(actions);

        // Task 4i: Calls the displayMenu() to print the full menu
        // menu.displayMenu();

        // Step 5d: Call getAction() and store the user input
        String userChoice = menu.getAction();

        // Step 5g: Convert String input to int and call doAction
        int action = Integer.parseInt(userChoice);
        doAction(action);
    }

    // Step 5e–5f: doAction method with switch logic
    public static void doAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("Unknown action, please try again.");
        }
    }
}