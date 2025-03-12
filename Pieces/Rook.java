package Pieces;

import Util.GridPoint;

public class Rook extends chessPiece{
    //This should be the 2025 bot because it is tallll
    public Rook(Color color, GridPoint startingPosition){
        movementPatterns.add(MovementPattern.STRAIGHT);
        this.pieceType = PieceType.ROOK;
        this.color = color;
        this.currentPoint = startingPosition;
    }
}
