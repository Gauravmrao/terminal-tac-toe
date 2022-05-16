// import java.util.Scanner;

public class Game {

    // Encapsulate a board and gamemode
    private Board board;
    private int gameMode;

    // initialize the game
    public Game(int mode) {
        board = new Board();
        gameMode = mode;
    }

    // Select the game mode. gameMode = 1 for single player, 2 for multiplayer
    public void gameModeSelection() {
        if (gameMode == 2) {
            runMultiplayer();
        }
    }

    // If multiplayer is selected, run a multiplayer game
    private void runMultiplayer() {
        Multiplayer multiplayer = new Multiplayer(board);
        multiplayer.playMultiplayer();
    }




    // 


    // TODO:
    // 1. Ask the player what gamemode they want, and record the input
    // 2. create an instance of that gamemode, and run it
    // 2. show the board
    // 2. player is prompted to input

}

