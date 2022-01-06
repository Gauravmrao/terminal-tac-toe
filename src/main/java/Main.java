
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class Main {


    // Main Menu Screen
    public static void mainMenu() {

        // Introductory Message.
        System.out.println("\n\nThanks for playing Terminal-Tac-Toe!");
        System.out.println("Select a game mode, single player (1p) or multiplayer (2p).");

        int mode = 0; // 0 for unselected game mode, 1 for single player, 2 for multiplayer.

        // Loops until the user selects the proper game mode.
        boolean validSelection = false;
        while (!validSelection) {

            // Prompts the user to select a game mode.
            Scanner ModeSelection = new Scanner(System.in);
            String gameMode;
            System.out.println("\nPlease input either 1p or 2p: ");
            gameMode = ModeSelection.nextLine();

            // Checks which game mode was selected, and if the selected game mode is valid.
            if (gameMode.equals("1p") || gameMode.equals("1P")) {
                System.out.println("You selected: Single Player!");
                mode = 1;
                validSelection = true;

            } else if (gameMode.equals("2p") || gameMode.equals("2P")) {
                System.out.println("You selected: Multiplayer!");
                mode = 2;
                validSelection = true;

            } else {
                System.out.println("Invalid game mode.");
            }
        }

        // TODO:
        // Implement the single player and the multiplayer functions
        // Based on the value of "mode", the correct function should be called.


    }



    public static void main(String[] args) {

        mainMenu();

    }

}
