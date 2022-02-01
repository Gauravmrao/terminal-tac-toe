import java.util.ArrayList;

public class Board {
    private String[][] board = new String[3][3];

    public Board() {
        // Initializes a new empty board;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
    }


    public String getElement(String index){
        // Returns the element in the board at a specified index.

        return switch (index) {
            case "A1", "a1" -> board[0][0];
            case "A2", "a2" -> board[0][1];
            case "A3", "a3" -> board[0][2];
            case "B1", "b1" -> board[1][0];
            case "B2", "b2" -> board[1][1];
            case "B3", "b3" -> board[1][2];
            case "C1", "c1" -> board[2][0];
            case "C2", "c2" -> board[2][1];
            case "C3", "c3" -> board[2][2];
            default -> "Invalid Argument, please try again.";
        };
    }


    public void setElement(String index, String player){
        // Sets the element in the board at a specified index with the input player value.

        switch (index) {
            case "A1", "a1": board[0][0] = player;
            case "A2", "a2": board[0][1] = player;
            case "A3", "a3": board[0][2] = player;
            case "B1", "b1": board[1][0] = player;
            case "B2", "b2": board[1][1] = player;
            case "B3", "b3": board[1][2] = player;
            case "C1", "c1": board[2][0] = player;
            case "C2", "c2": board[2][1] = player;
            case "C3", "c3": board[2][2] = player;
        }
    }



    public int updateBoard(String playerMove, String player) {
        // Updates the board with the player's move.

        if (getElement(playerMove).equals(" ")) {
            setElement(playerMove, player);
            return 1;
        } else {
            System.out.println("That spot has already been taken, choose a different spot!");
            return 0;
        }
    }

    public void showBoard() {
        System.out.println("Current Board:");
        System.out.println("        1       2       3");
        System.out.println("    -------------------------");
        System.out.println("A   |   " + board[0][0] + "   |   " + board[0][1] + "   |   " + board[0][2] + "   |");
        System.out.println("    -------------------------");
        System.out.println("B   |   " + board[1][0] + "   |   " + board[1][1] + "   |   " + board[1][2] + "   |");
        System.out.println("    -------------------------");
        System.out.println("C   |   " + board[2][0] + "   |   " + board[2][1] + "   |   " + board[2][2] + "   |");
        System.out.println("    -------------------------");

    }


}
