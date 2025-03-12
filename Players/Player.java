package Players;

import java.util.ArrayList;
import java.util.Random;

import Pieces.chessPiece;
import Pieces.chessPiece.Color;
import Util.GridPoint;

public class Player {
    private String name;
    private Color color;
    public class turnAction {
        private chessPiece pieceToMove;
        private GridPoint newLocation;
    
        public turnAction(chessPiece pieceToMove, GridPoint newLocation) {
            this.pieceToMove = pieceToMove;
            this.newLocation = newLocation;
        }
    
        public chessPiece getPieceToMove() {
            return pieceToMove;
        }
    
        public GridPoint getNewLocation() {
            return newLocation;
        }
    }
    
    public Player(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public boolean isWhite() {
        return Color.WHITE == color;
    }

    public turnAction Turn(ArrayList<chessPiece> myPieces, ArrayList<chessPiece> opponentPieces) {
        // lets the players decide what to do then returns a turnAction that consists of the piece to move and the new location
        Random random = new Random();
        chessPiece pieceToMove = myPieces.get(random.nextInt(myPieces.size()));
        GridPoint newLocation = pieceToMove.getValidMoves().get(random.nextInt(pieceToMove.getValidMoves().size()));
        return new turnAction(pieceToMove, newLocation);
    }

}
