package Pieces;

import Util.GridPoint;

public class Knight extends chessPiece{
    public Knight(Color color, GridPoint startingPosition){
        movementPatterns.add(MovementPattern.KNIGHT);
        this.color = color;
        this.pieceType = PieceType.KNIGHT;
        this.currentPoint = startingPosition;
    }
}
