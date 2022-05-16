// import java.util.ArrayList;
// import java.util.function.ToDoubleBiFunction;

// The Main Class
public class Main {



    // TODO:
    // Implement the single player and the multiplayer functions
    // Based on the value of "mode", the correct function should be called.



    // The main function
    public static void main(String[] args) {


        // Run the main menu
        MainMenu menu = new MainMenu();
        int gameMode = menu.runMainMenu();

        Board board = new Board();
        if (gameMode == 2) {
            Multiplayer multiplayer = new Multiplayer(board);
            multiplayer.playMultiplayer();
        }



        // Start a game
        // Game game = new Game(gameMode);
        // game.gameModeSelection();


        // Board board = new Board();
        // board.showBoard();

    }

}
