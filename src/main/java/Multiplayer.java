import java.util.Scanner;

public class Multiplayer {
    private Board board;
    private String player;

    // Class constructor
    public Multiplayer(Board gameBoard){
        board = gameBoard;
        player = "X";
    }


    // Successfully completes a move on the board.
    public void move(){
        
        board.showBoard();

        // Gets the player's input and updates the board.
        System.out.println("\nPlayer " + player + ", Please enter the coordinate of the cell you would like to select.");
        Scanner move = new Scanner(System.in);
        String coordinate = move.nextLine();

        int moveCompleted = 0;
        while(moveCompleted != 1) {
            moveCompleted = board.updateBoard(coordinate, player);
        }

        // Moves to the next player's turn.
        if (player.equals("X")) {
            player = "O";
        } else {
            player = "X";
        }

        move.close();
    }


    public int checkWin() {
        int winner = 0;


        if (board.getElement("A1").equals(player) && board.getElement("A2").equals(player) && board.getElement("A3").equals(player)) {
            winner = 1;
        } else if (board.getElement("B1").equals(player) && board.getElement("B2").equals(player) && board.getElement("B3").equals(player)) {
            winner = 1;
        } else if (board.getElement("C1").equals(player) && board.getElement("C2").equals(player) && board.getElement("C3").equals(player)) {
            winner = 1;
        } else if (board.getElement("A1").equals(player) && board.getElement("B1").equals(player) && board.getElement("C1").equals(player)) {
            winner = 1;
        } else if (board.getElement("A2").equals(player) && board.getElement("B2").equals(player) && board.getElement("C2").equals(player)) {
            winner = 1;
        } else if (board.getElement("A3").equals(player) && board.getElement("B3").equals(player) && board.getElement("C3").equals(player)) {
            winner = 1;
        } else if (board.getElement("A1").equals(player) && board.getElement("B2").equals(player) && board.getElement("C3").equals(player)) {
            winner = 1;
        } else if (board.getElement("A3").equals(player) && board.getElement("B2").equals(player) && board.getElement("C1").equals(player)) {
            winner = 1;
        }
        return winner;
    }



    //public int gameOver() {
    //    for ()
    // }

}
