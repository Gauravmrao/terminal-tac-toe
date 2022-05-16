
import java.util.Scanner;

public class MainMenu {

    public MainMenu() {}



    private void introMessage() {
        // Introductory Message.

        System.out.println("\n\nThanks for playing Terminal-Tac-Toe!");
        System.out.println("Select a game mode, single player (1p) or multiplayer (2p).");
    }


    private int gameModeSelection() {
        // Loops until the user selects the proper game mode, then returns it.

        int mode = 0; // 0 for unselected game mode, 1 for single player, 2 for multiplayer.
        boolean validSelection = false;
        while (!validSelection) {

            // Prompts the user to select a game mode.
            Scanner ModeSelection = new Scanner(System.in);
            String gameMode;
            System.out.println("\nPlease input either 1p or 2p: ");
            gameMode = ModeSelection.nextLine();

            // Checks which game mode was selected, and if the selected game mode is valid.
            if (gameMode.equals("1p") || gameMode.equals("1P")) {
                System.out.println("You selected: Single Player!\n");
                mode = 1;
                validSelection = true;
                // ModeSelection.close();

            } else if (gameMode.equals("2p") || gameMode.equals("2P")) {
                System.out.println("You selected: Multiplayer!\n");
                mode = 2;
                validSelection = true;
                // ModeSelection.close();

            } else {
                System.out.println("Invalid game mode.");
            }
            
        }
        return mode;
    }

    // Runs the main menu when called.
    public int runMainMenu() {
        introMessage();
        int mode = gameModeSelection();
        return mode;
    }

}
