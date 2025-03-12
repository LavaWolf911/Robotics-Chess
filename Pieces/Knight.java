package Pieces;

import Util.GridPoint;
import Util.PieceConstants;
import java.net.MalformedURLException;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Knight extends chessPiece {
    private String name;
    private JLabel peiceIMG;

    public Knight(Color color, GridPoint startingPosition, JPanel[][] squares, String name) {
        movementPatterns.add(MovementPattern.KNIGHT);
        this.color = color;
        this.pieceType = PieceType.KNIGHT;
        this.currentPoint = startingPosition;
        try {
            if (Color.BLACK == color) {
                squares[startingPosition.getX()][startingPosition.getY()]
                        .add(createResizedLabel(PieceConstants.imageURLS.bKnight.toURL(), 75, 75));
            } else {
                squares[startingPosition.getX()][startingPosition.getY()]
                        .add(createResizedLabel(PieceConstants.imageURLS.wKnight.toURL(), 75, 75));
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
        for (var a : getValidMoves()){
            System.out.println(a);
        }
        if (getValidMoves().contains(newPose)) {
            
            squares[getPose().getX()][getPose().getY()].remove(peiceIMG);
            squares[newPose.getX()][newPose.getY()].add(peiceIMG);
        } else {
            System.out.println("Invalid move.");
        }
    }
}
