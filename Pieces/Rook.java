package Pieces;

import Util.GridPoint;
import Util.PieceConstants;
import java.net.MalformedURLException;
import javax.swing.JPanel;

public class Rook extends chessPiece{
    //This should be the 2025 bot because it is tallll
    public Rook(Color color, GridPoint startingPosition, JPanel[][] squares, String name){
        movementPatterns.add(MovementPattern.STRAIGHT);
        this.pieceType = PieceType.ROOK;
        this.color = color;
        this.currentPoint = startingPosition;
        try {
            if (Color.BLACK == color) {
            squares[startingPosition.getX()][startingPosition.getY()].add(createResizedLabel(PieceConstants.imageURLS.bRook.toURL(), 75, 75));
            } else {
            squares[startingPosition.getX()][startingPosition.getY()].add(createResizedLabel(PieceConstants.imageURLS.wRook.toURL(), 75, 75));
            }
            squares[startingPosition.getX()][startingPosition.getY()].setName(name);
            squares[startingPosition.getX()][startingPosition.getY()].revalidate();
            squares[startingPosition.getX()][startingPosition.getY()].repaint();
        } catch (MalformedURLException ex) {
            System.out.println("Error: " + ex.toString().trim() + " Please try again");
        }
    }
    
}
