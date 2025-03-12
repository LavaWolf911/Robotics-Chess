package Pieces;

import Util.GridPoint;

public class Pawn extends chessPiece{
    public Pawn(Color color, GridPoint startingPosition){
        movementPatterns.add(MovementPattern.PAWN);
        pieceType = PieceType.PAWN;
        this.color = color;
        this.currentPoint = startingPosition;
    }
}
