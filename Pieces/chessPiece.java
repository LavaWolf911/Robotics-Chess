package Pieces;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Util.GridPoint;
import java.awt.Image;

public class chessPiece {
    public enum MovementPattern {
        DIAGONAL(new GridPoint[] { new GridPoint(1, 1), new GridPoint(1, -1), new GridPoint(-1, -1),
                new GridPoint(-1, 1) }, true),
        STRAIGHT(new GridPoint[] { new GridPoint(0, 1), new GridPoint(1, 0), new GridPoint(0, -1),
                new GridPoint(-1, 0) }, true),
        KNIGHT(new GridPoint[] { new GridPoint(1, 2), new GridPoint(-1, 2), new GridPoint(2, 1), new GridPoint(2, -1),
                new GridPoint(1, -2), new GridPoint(-1, -2), new GridPoint(-2, 1), new GridPoint(-2, -1) }, false),
        PAWN(new GridPoint[] { new GridPoint(0, 1) }, false), // Pawn movement is special and will need to be fixed
                                                              // later
        KING(new GridPoint[] { new GridPoint(0, 1), new GridPoint(1, 1), new GridPoint(1, 0), new GridPoint(1, -1),
                new GridPoint(0, -1), new GridPoint(-0, -1), new GridPoint(-1, 0), new GridPoint(-1, 1) }, false);

        public final GridPoint[] ValidMoves;
        public final boolean IsContinuous;

        MovementPattern(GridPoint[] validMoves, boolean isContinuous) {
            this.ValidMoves = validMoves;
            this.IsContinuous = isContinuous;
        }
    };

    public enum Color {
        WHITE,
        BLACK
    };

    public enum PieceType {
        PAWN,
        ROOK,
        KNIGHT,
        BISHOP,
        QUEEN,
        KING
    };

    public PieceType pieceType;
    public GridPoint currentPoint;
    public Color color;

    public boolean isWhite() {
        return color == Color.WHITE;
    }

    public List<MovementPattern> movementPatterns = new ArrayList<MovementPattern>();

    public List<GridPoint> getValidMoves() {
        ArrayList<GridPoint> validMoves = new ArrayList<GridPoint>();
        for (MovementPattern movementPattern : movementPatterns) {
            if (movementPattern.IsContinuous) {
                for (GridPoint gridPoint : movementPattern.ValidMoves) {
                    GridPoint nextPoint = currentPoint.plus(gridPoint);
                    while (nextPoint.inBoard()) {
                        validMoves.add(nextPoint);
                        nextPoint = nextPoint.plus(gridPoint);
                    }
                }
                
            } else {
                for (GridPoint gridPoint : movementPattern.ValidMoves) {
                    if (currentPoint.plus(gridPoint).inBoard()){
                        validMoves.add(currentPoint.plus(gridPoint));
                    }
                }
            }

        }
        return validMoves;
    }
    public JLabel createResizedLabel(URL imageURL, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(imageURL);
        Image resizedImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new JLabel(new ImageIcon(resizedImage));
    }

}
