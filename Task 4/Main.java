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

        //  test prints element at index 2 which is = 3) Pause game
        System.out.println(actions.get(2));

        // Task 4g: Creates a GameMenu object and passes the actions list
        GameMenu menu = new GameMenu(actions);

        // Task 4i: Calls the displayMenu() to print the full menu
        menu.displayMenu();
    }
}