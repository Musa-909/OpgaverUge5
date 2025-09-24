import java.util.ArrayList;

// Task 4a: Creates the GameMenu class
class GameMenu {
    
    // Task 4b: A private instance variable of the type ArrayList<String>
    private ArrayList<String> actions = new ArrayList<>();

    // Task 4c + 4d: A constructor that takes ArrayList<String> and assigns it
    GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    // Task 4h: A method that display all actions
    void displayMenu() {
        // A for each loop that loops through the list and print each action
        for (String action : actions) {
            System.out.println(action);
        }
    }
}