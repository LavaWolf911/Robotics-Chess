package Pieces;

import Util.GridPoint;

public class Queen extends chessPiece{
    public Queen(Color color, GridPoint startingPosition){
        movementPatterns.add(MovementPattern.DIAGONAL);
        movementPatterns.add(MovementPattern.STRAIGHT);
        this.pieceType = PieceType.QUEEN;
        this.color = color;
        this.currentPoint = startingPosition;
    }
}
