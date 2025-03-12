
package GUI;

import Pieces.*;
import Util.GridPoint;
import Util.PieceConstants;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.net.MalformedURLException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class board {
    // Toolkit t = Toolkit.getDefaultToolkit();
    static JFrame f = new JFrame();
    static JPanel[][] squares = new JPanel[8][8];

    // Defining pawns
    Pawn wAPawn;
    Pawn wBPawn;
    Pawn wCPawn;
    Pawn wDPawn;
    Pawn wEPawn;
    Pawn wFPawn;
    Pawn wGPawn;
    Pawn wHPawn;
    Rook wARook;
    Rook wHRook;
    Knight wBKnight;
    Knight wGKnight;
    Bishop wCBishop;
    Bishop wFBishop;
    Queen wQueen;
    King wKing;

    Pawn bAPawn;
    Pawn bBPawn;
    Pawn bCPawn;
    Pawn bDPawn;
    Pawn bEPawn;
    Pawn bFPawn;
    Pawn bGPawn;
    Pawn bHPawn;
    Rook bARook;
    Rook bHRook;
    Knight bBKnight;
    Knight bGKnight;
    Bishop bCBishop;
    Bishop bFBishop;
    Queen bQueen;
    King bKing;

    public board() {

    }

    public void setStartingPieces() throws MalformedURLException {
        wAPawn = new Pawn(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wAPawn, squares,
                "White Pawn [A]");
        wBPawn = new Pawn(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wBPawn, squares,
                "White Pawn [B]");
        wCPawn = new Pawn(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wCPawn, squares,
                "White Pawn [C]");
        wDPawn = new Pawn(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wDPawn, squares,
                "White Pawn [D]");
        wEPawn = new Pawn(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wEPawn, squares,
                "White Pawn [E]");
        wFPawn = new Pawn(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wFPawn, squares,
                "White Pawn [F]");
        wGPawn = new Pawn(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wGPawn, squares,
                "White Pawn [G]");
        wHPawn = new Pawn(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wHPawn, squares,
                "White Pawn [H]");
        wARook = new Rook(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wARook, squares,
                "White Rook [A]");
        wHRook = new Rook(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wHRook, squares,
                "White Rook [H]");
        wBKnight = new Knight(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wBKnight, squares,
                "White Knight [B]");
        wGKnight = new Knight(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wGKnight, squares,
                "White Knight [G]");
        wCBishop = new Bishop(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wCBishop, squares,
                "White Bishop [C]");
        wFBishop = new Bishop(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wFBishop, squares,
                "White Bishop [F]");
        wQueen = new Queen(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wQueen, squares,
                "White Queen");
        wKing = new King(Pieces.chessPiece.Color.WHITE, PieceConstants.startingPosition.wKing, squares, "White King");

        bAPawn = new Pawn(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bAPawn, squares,
                "Black Pawn [A]");
        bBPawn = new Pawn(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bBPawn, squares,
                "Black Pawn [B]");
        bCPawn = new Pawn(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bCPawn, squares,
                "Black Pawn [C]");
        bDPawn = new Pawn(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bDPawn, squares,
                "Black Pawn [D]");
        bEPawn = new Pawn(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bEPawn, squares,
                "Black Pawn [E]");
        bFPawn = new Pawn(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bFPawn, squares,
                "Black Pawn [F]");
        bGPawn = new Pawn(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bGPawn, squares,
                "Black Pawn [G]");
        bHPawn = new Pawn(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bHPawn, squares,
                "Black Pawn [H]");
        bARook = new Rook(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bARook, squares,
                "Black Rook [A]");
        bHRook = new Rook(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bHRook, squares,
                "Black Rook [H]");
        bBKnight = new Knight(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bBKnight, squares,
                "Black Knight [B]");
        bGKnight = new Knight(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bGKnight, squares,
                "Black Knight [G]");
        bCBishop = new Bishop(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bCBishop, squares,
                "Black Bishop [C]");
        bFBishop = new Bishop(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bFBishop, squares,
                "Black Bishop [F]");
        bQueen = new Queen(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bQueen, squares,
                "Black Queen");
        bKing = new King(Pieces.chessPiece.Color.BLACK, PieceConstants.startingPosition.bKing, squares, "Black King");
    }

    // Helper method to create a resized JLabel

    public void buildBoard() throws MalformedURLException {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JPanel();
                if ((i + j) % 2 == 0) {
                    squares[i][j].setBackground(java.awt.Color.BLACK);
                } else {
                    squares[i][j].setBackground(java.awt.Color.WHITE);
                }
                squares[i][j].setBounds(i * 75, j * 75, 75, 75);
                f.add(squares[i][j]);
                squares[i][j].addContainerListener(new ContainerListener() {

                    @Override
                    public void componentAdded(ContainerEvent e) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void componentRemoved(ContainerEvent e) {
                        // TODO Auto-generated method stub
                    }
                });
            }
        }
        // setStartingPieces();
        setStartingPieces();
        f.setSize(815, 830);
        f.setLayout(null);
        f.setVisible(true);
        // f.setVisible(false);
        // System.out.println("\nCurrent Pose of (" + wBKnight.getName() + ")\n[" + wBKnight.getPose().getX() + "] [" + wBKnight.getPose().getY() + "]");
        // System.out.println("\nAttempting to move " + wBKnight.getName() + " to [" + (wEPawn.getPose().getX()+3) + "] [" + (wEPawn.getPose().getY()) + "]\n");
        // wBKnight.movePeice(new GridPoint(wEPawn.getPose().getX()+3,wEPawn.getPose().getY()-1), squares);
        // f.setVisible(true);

    }

    public static void main(String[] args) {
        board b = new board();
        try {
            b.buildBoard();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // Rook r = new Rook(Color.WHITE, new GridPoint(5, 3));
        // for (GridPoint point : r.getValidMoves()) {
        // System.out.println(point.getX() + " " + point.getY());
        // getSquare(point).setBackground(java.awt.Color.RED);
        // }
        // System.err.println("Knight");
        // Pieces.Knight k = new Pieces.Knight(Color.WHITE, new GridPoint(0, 0));
        // for (GridPoint point : k.getValidMoves()) {
        // System.out.println(point.getX() + " " + point.getY());
        // }
        
    }

    public static JPanel getSquare(GridPoint point) {
        return squares[point.getX()][7 - point.getY()];
    }
}