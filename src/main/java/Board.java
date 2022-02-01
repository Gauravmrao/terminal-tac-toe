import java.util.ArrayList;

public class Board {
    private String[][] board = new String[3][3];

    public Board() {
        // Initializes a new empty board;

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++) {
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

    public void updateBoard(String playerMove, String player) {


    }

}
