// The Main Class
public class Main {


    // The main function
    public static void main(String[] args) {

        // Run the main menu
        MainMenu menu = new MainMenu();
        int gameMode = menu.runMainMenu();

        // run the selected game mode
        Board board = new Board();
        if (gameMode == 2) {
            Multiplayer multiplayer = new Multiplayer(board);
            multiplayer.playMultiplayer();
        } else {
            System.out.println("Single player functionality hasn't been implemented yet");
        }



    }


    // TODO:
    // 1. Implement single player functionality
    //      a. Easy, medium, and hard mode
    // 2. Add a "play again" feature

}
