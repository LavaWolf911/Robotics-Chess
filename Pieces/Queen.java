package Pieces;

import Util.GridPoint;
import Util.PieceConstants;
import java.net.MalformedURLException;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Queen extends chessPiece {
    private String name;
    private JLabel peiceIMG;

    public Queen(Color color, GridPoint startingPosition, JPanel[][] squares, String name) {
        movementPatterns.add(MovementPattern.DIAGONAL);
        movementPatterns.add(MovementPattern.STRAIGHT);
        this.pieceType = PieceType.QUEEN;
        this.color = color;
        this.currentPoint = startingPosition;
        try {
            if (Color.BLACK == color) {
                squares[startingPosition.getX()][startingPosition.getY()]
                        .add(createResizedLabel(PieceConstants.imageURLS.bQueen.toURL(), 75, 75));
            } else {
                squares[startingPosition.getX()][startingPosition.getY()]
                        .add(createResizedLabel(PieceConstants.imageURLS.wQueen.toURL(), 75, 75));
            }
            squares[startingPosition.getX()][startingPosition.getY()].setName(name);
            squares[startingPosition.getX()][startingPosition.getY()].revalidate();
            squares[startingPosition.getX()][startingPosition.getY()].repaint();
        } catch (MalformedURLException ex) {
            System.out.println("Error: " + ex.toString().trim() + " Please try again");
        }
    }

    public String getName() {
        return name;
    }

    public GridPoint getPose() {
        return currentPoint;
    }

    public Color getColor() {
        return color;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void movePeice(GridPoint newPose, JPanel[][] squares) {
        if (getValidMoves().contains(newPose)) {
            squares[getPose().getX()][getPose().getY()].remove(peiceIMG);
            squares[newPose.getX()][newPose.getY()].add(peiceIMG);
        } else {
            System.out.println("Invalid move.");
        }
    }
}
