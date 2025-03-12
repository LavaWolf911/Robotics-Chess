package Pieces;

import Util.GridPoint;

public class Bishop extends chessPiece {
    public Bishop(Color color, GridPoint startingPosition){
        movementPatterns.add(MovementPattern.DIAGONAL);
        this.pieceType = PieceType.BISHOP;
        this.color = color;
        this.currentPoint = startingPosition;

    }
}
