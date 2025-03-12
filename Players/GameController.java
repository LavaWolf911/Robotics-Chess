package Players;

import java.lang.reflect.Array;
import java.util.ArrayList;

import GUI.board;
import Pieces.chessPiece;
import Players.Player.turnAction;
import Util.GridPoint;

public class GameController {
    private Player player1;
    private Player player2;
    public boolean isGameOver = false;
    public board board;
    public GameController(Player player1, Player player2, board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;

    }

    public void startGame() {
        while (!isGameOver) {
            turnAction action = player1.Turn(board.getWhiteChessPieces(), board.getBlackChessPieces());
            if (action.getPieceToMove().getValidMoves().contains(action.getNewLocation())) {
                board.updateBoard(action.getPieceToMove(), action.getNewLocation());
                action.getPieceToMove().movePeice(action.getNewLocation());
            }
        }
    }
}
