package Pieces;

import Util.GridPoint;

public interface chessPiece {
    public GridPoint gridPoint();

    public boolean isWhite();

    public default int x(){
        return gridPoint().x;
    }

    public default int y(){
        return gridPoint().y;
    }
}
