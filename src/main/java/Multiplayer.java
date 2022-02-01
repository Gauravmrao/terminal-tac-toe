import java.util.Scanner;

public class Multiplayer {
    private Board board;
    private String player;


    public Multiplayer(Board gameBoard){
        // Class constructor

        board = gameBoard;
        player = "X";
    }


    public void move(){
        // Successfully completes a move on the board.

        board.showBoard();

        // Gets the player's input and updates the board.
        System.out.println("\nPlayer " + player + ", Please enter the coordinate of the cell you would like to select.");
        Scanner move = new Scanner(System.in);
        String gameMode;
        gameMode = move.nextLine();

        int moveCompleted = 0;
        while(moveCompleted != 1) {
            moveCompleted = board.updateBoard(gameMode, player);
        }

        // Moves to the next player's turn.
        if (player.equals("X")) {
            player = "O";
        } else {
            player = "X";
        }
    }


    public void checkWin() {

    }



    public int gameOver() {
        return 1;
    }

}
