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

        // Start a game
        Game game = new Game(gameMode);


        Board board = new Board();
        board.showBoard();

    }

}
