package Pieces;

import Util.GridPoint;
import Util.PieceConstants;
import java.net.MalformedURLException;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bishop extends chessPiece {
    private String name;
    private JLabel peiceIMG;

    public Bishop(Color color, GridPoint startingPosition, JPanel[][] squares, String name) {
        movementPatterns.add(MovementPattern.DIAGONAL);
        this.name = name;
        this.pieceType = PieceType.BISHOP;
        this.color = color;
        this.currentPoint = startingPosition;
        try {
            if (Color.BLACK == color) {
                peiceIMG = createResizedLabel(PieceConstants.imageURLS.bBishop.toURL(), 75, 75);
                squares[startingPosition.getX()][startingPosition.getY()]
                        .add(peiceIMG);
            } else {
                peiceIMG = createResizedLabel(PieceConstants.imageURLS.wBishop.toURL(), 75, 75);
                squares[startingPosition.getX()][startingPosition.getY()]
                        .add(peiceIMG);
            }
            squares[startingPosition.getX()][startingPosition.getY()].setName(name);
            squares[startingPosition.getX()][startingPosition.getY()].revalidate();
            squares[startingPosition.getX()][startingPosition.getY()].repaint();
        } catch (MalformedURLException ex) {
            System.out.println("Error: " + ex.toString().trim() + "Please try again");
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
