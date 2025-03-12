package Pieces;

import Util.GridPoint;

public class Bishop implements chessPiece {
    public Bishop() {

    }

    @Override 
    public boolean isWhite(){
        return false;  
    }
    @Override
    public GridPoint gridPoint() {
        return new GridPoint(0,0);
    }
}
