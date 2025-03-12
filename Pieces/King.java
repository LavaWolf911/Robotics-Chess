package Pieces;

import Util.GridPoint;

public class King extends chessPiece{
    public King(Color color, GridPoint startingPosition){
        this.currentPoint = startingPosition;
        movementPatterns.add(MovementPattern.KING);
        this.color = color;
        this.pieceType = PieceType.KING;
    }
}
