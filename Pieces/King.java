package Pieces;

import Util.GridPoint;
import Util.PieceConstants;
import java.net.MalformedURLException;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class King extends chessPiece {

    public King(Color color, GridPoint startingPosition, JPanel[][] squares, String name) {
        this.currentPoint = startingPosition;
        movementPatterns.add(MovementPattern.KING);
        this.color = color;
        this.pieceType = PieceType.KING;
        try {
            if (isWhite()) {
                this.peiceIMG = createResizedLabel(PieceConstants.imageURLS.wKing.toURL(), 75, 75);
            } else {
                this.peiceIMG = createResizedLabel(PieceConstants.imageURLS.bKing.toURL(), 75, 75);

            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            if (Color.BLACK == color) {
                squares[startingPosition.getX()][startingPosition.getY()]
                        .add(createResizedLabel(PieceConstants.imageURLS.bKing.toURL(), 75, 75));
            } else {
                squares[startingPosition.getX()][startingPosition.getY()]
                        .add(createResizedLabel(PieceConstants.imageURLS.wKing.toURL(), 75, 75));
            }
            squares[startingPosition.getX()][startingPosition.getY()].setName(name);
            squares[startingPosition.getX()][startingPosition.getY()].revalidate();
            squares[startingPosition.getX()][startingPosition.getY()].repaint();
        } catch (MalformedURLException ex) {
            System.out.println("Error: " + ex.toString().trim() + " Please try again");
        }
    }


}
