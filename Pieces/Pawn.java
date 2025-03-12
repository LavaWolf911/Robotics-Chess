package Pieces;

import Util.GridPoint;
import Util.PieceConstants;
import java.net.MalformedURLException;
import javax.swing.JPanel;

public class Pawn extends chessPiece{
    public Pawn(Color color, GridPoint startingPosition, JPanel[][] squares, String name){
        movementPatterns.add(MovementPattern.PAWN);
        pieceType = PieceType.PAWN;
        this.color = color;
        this.currentPoint = startingPosition;
        try {
            if (Color.BLACK == color) {
            squares[startingPosition.getX()][startingPosition.getY()].add(createResizedLabel(PieceConstants.imageURLS.bPawn.toURL(), 75, 75));
            } else {
            squares[startingPosition.getX()][startingPosition.getY()].add(createResizedLabel(PieceConstants.imageURLS.wPawn.toURL(), 75, 75));
            }
            squares[startingPosition.getX()][startingPosition.getY()].setName(name);
            squares[startingPosition.getX()][startingPosition.getY()].revalidate();
            squares[startingPosition.getX()][startingPosition.getY()].repaint();
        } catch (MalformedURLException ex) {
            System.out.println("Error: " + ex.toString().trim() + " Please try again");
        }
    }
}
