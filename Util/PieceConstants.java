package Util;

import java.net.URI;

public class PieceConstants {
    public class startingPosition {
        public static final GridPoint wAPawn = new GridPoint(0, 6);
        public static final GridPoint wBPawn = new GridPoint(1, 6);
        public static final GridPoint wCPawn = new GridPoint(2, 6);
        public static final GridPoint wDPawn = new GridPoint(3, 6);
        public static final GridPoint wEPawn = new GridPoint(4, 6);
        public static final GridPoint wFPawn = new GridPoint(5, 6);
        public static final GridPoint wGPawn = new GridPoint(6, 6);
        public static final GridPoint wHPawn = new GridPoint(7, 6);
        public static final GridPoint wARook = new GridPoint(0, 7);
        public static final GridPoint wHRook = new GridPoint(7, 7);
        public static final GridPoint wBKnight = new GridPoint(1, 7);
        public static final GridPoint wGKnight = new GridPoint(6, 7);
        public static final GridPoint wCBishop = new GridPoint(2, 7);
        public static final GridPoint wFBishop = new GridPoint(5, 7);
        public static final GridPoint wQueen = new GridPoint(3, 7);
        public static final GridPoint wKing = new GridPoint(4, 7);

        public static final GridPoint bAPawn = new GridPoint(0, 1);
        public static final GridPoint bBPawn = new GridPoint(1, 1);
        public static final GridPoint bCPawn = new GridPoint(2, 1);
        public static final GridPoint bDPawn = new GridPoint(3, 1);
        public static final GridPoint bEPawn = new GridPoint(4, 1);
        public static final GridPoint bFPawn = new GridPoint(5, 1);
        public static final GridPoint bGPawn = new GridPoint(6, 1);
        public static final GridPoint bHPawn = new GridPoint(7, 1);
        public static final GridPoint bARook = new GridPoint(0, 0);
        public static final GridPoint bHRook = new GridPoint(7, 0);
        public static final GridPoint bBKnight = new GridPoint(1, 0);
        public static final GridPoint bGKnight = new GridPoint(6, 0);
        public static final GridPoint bCBishop = new GridPoint(2, 0);
        public static final GridPoint bFBishop = new GridPoint(5, 0);
        public static final GridPoint bQueen = new GridPoint(3, 0);
        public static final GridPoint bKing = new GridPoint(4, 0);

    }

    public class imageURLS {
    public static final URI bRook = URI.create("https://images.chesscomfiles.com/chess-themes/pieces/neo/150/br.png");
    public static final URI bKnight = URI.create("https://images.chesscomfiles.com/chess-themes/pieces/neo/150/bn.png");
    public static final URI bBishop = URI.create("https://images.chesscomfiles.com/chess-themes/pieces/neo/150/bb.png");
    public static final URI bQueen = URI.create("https://images.chesscomfiles.com/chess-themes/pieces/neo/150/bq.png");
    public static final URI bKing = URI.create("https://images.chesscomfiles.com/chess-themes/pieces/neo/150/bk.png");
    public static final URI bPawn = URI.create("https://images.chesscomfiles.com/chess-themes/pieces/neo/150/bp.png");

    public static final URI wRook = URI.create("https://images.chesscomfiles.com/chess-themes/pieces/neo/150/wr.png");
    public static final URI wKnight = URI.create("https://images.chesscomfiles.com/chess-themes/pieces/neo/150/wn.png");
    public static final URI wBishop = URI.create("https://images.chesscomfiles.com/chess-themes/pieces/neo/150/wb.png");
    public static final URI wQueen = URI.create("https://images.chesscomfiles.com/chess-themes/pieces/neo/150/wq.png");
    public static final URI wKing = URI.create("https://images.chesscomfiles.com/chess-themes/pieces/neo/150/wk.png");
    public static final URI wPawn = URI.create("https://images.chesscomfiles.com/chess-themes/pieces/neo/150/wp.png");
}

}
