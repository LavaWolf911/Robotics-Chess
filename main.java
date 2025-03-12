import java.net.MalformedURLException;

import GUI.board;
import Players.GameController;
import Players.Player;

public class main {
    public static void main(String[] args) {
        board board = new board();
        
        Player white = new Player("White", Pieces.chessPiece.Color.WHITE);
        Player black = new Player("Black", Pieces.chessPiece.Color.BLACK);

        GameController game = new GameController(white, black, board);
        try {
            board.buildBoard();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        game.startGame();
    }
}
