package Pieces;

import Util.GridPoint;
import Util.PieceConstants;
import java.net.MalformedURLException;
import javax.swing.JPanel;

public class Bishop extends chessPiece {
    public Bishop(Color color, GridPoint startingPosition, JPanel[][] squares, String name) {
        movementPatterns.add(MovementPattern.DIAGONAL);
        this.pieceType = PieceType.BISHOP;
        this.color = color;
        this.currentPoint = startingPosition;
        try {
            if (Color.BLACK == color) {
                squares[startingPosition.getX()][startingPosition.getY()].add(createResizedLabel(PieceConstants.imageURLS.bBishop.toURL(), 75, 75));
            } else {
                squares[startingPosition.getX()][startingPosition.getY()].add(createResizedLabel(PieceConstants.imageURLS.wBishop.toURL(), 75, 75));
            }
            squares[startingPosition.getX()][startingPosition.getY()].setName(name);
            squares[startingPosition.getX()][startingPosition.getY()].revalidate();
            squares[startingPosition.getX()][startingPosition.getY()].repaint();
        } catch (MalformedURLException ex) {
            System.out.println("Error: " + ex.toString().trim() + "Please try again");
        }
        
    }
}
