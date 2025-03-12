
package GUI;

import java.awt.*;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Pieces.Pawn;
import Pieces.Queen;
import Pieces.Rook;
import Pieces.chessPiece;
import Pieces.chessPiece.Color;
import Util.GridPoint;

public class board {
    Toolkit t = Toolkit.getDefaultToolkit();
    static JFrame f = new JFrame();
    static JPanel[][] squares = new JPanel[8][8];

    ImageIcon whitePawn = new ImageIcon("PieceImages/wp.png");

    // Defining Peices
    static chessPiece whitePawn1 = new Pawn(Color.WHITE, new GridPoint(0, 1));
    static chessPiece whitePawn2 = new Pawn(Color.WHITE, new GridPoint(1, 1));
    static chessPiece whitePawn3 = new Pawn(Color.WHITE, new GridPoint(2, 1));
    static chessPiece whitePawn4 = new Pawn(Color.WHITE, new GridPoint(3, 1));
    static chessPiece whitePawn5 = new Pawn(Color.WHITE, new GridPoint(4, 1));
    static chessPiece whitePawn6 = new Pawn(Color.WHITE, new GridPoint(5, 1));
    static chessPiece whitePawn7 = new Pawn(Color.WHITE, new GridPoint(6, 1));
    static chessPiece whitePawn8 = new Pawn(Color.WHITE, new GridPoint(7, 1));
    static chessPiece whiteRook1 = new Rook(Color.WHITE, new GridPoint(0, 0));
    static chessPiece whiteRook2 = new Rook(Color.WHITE, new GridPoint(7, 0));
    static chessPiece whiteKnight1 = new Rook(Color.WHITE, new GridPoint(1, 0));
    static chessPiece whiteKnight2 = new Rook(Color.WHITE, new GridPoint(6, 0));
    static chessPiece whiteBishop1 = new Rook(Color.WHITE, new GridPoint(2, 0));
    static chessPiece whiteBishop2 = new Rook(Color.WHITE, new GridPoint(5, 0));
    static chessPiece whiteQueen = new Queen(Color.WHITE, new GridPoint(3, 0));
    static chessPiece whiteKing = new Queen(Color.WHITE, new GridPoint(4, 0));

    public board() {

    }

    public void setPieces() {
        // White Pawns

        for (int i = 0; i < 8; i++) {
            squares[i][6].add(new JLabel(new ImageIcon("PieceImages/wp.png")));
        }
        // White Rooks
        // squares[0][7].add(new JLabel(new ImageIcon("PieceImages/wr.png")));
        // squares[7][7].add(new JLabel(new ImageIcon("PieceImages/wr.png")));
        // //White Knights
        // squares[1][7].add(new JLabel(new ImageIcon("PieceImages/wn.png")));
        // squares[6][7].add(new JLabel(new ImageIcon("PieceImages/wn.png")));
        // //White Bishops
        // squares[2][7].add(new JLabel(new ImageIcon("PieceImages/wb.png")));
        // squares[5][7].add(new JLabel(new ImageIcon("PieceImages/wb.png")));
        // //White Queen
        // squares[3][7].add(new JLabel(new ImageIcon("PieceImages/wq.png")));
        // //White King
        // squares[4][7].add(new JLabel(new ImageIcon("PieceImages/wk.png")));
        // //Black Pawns
        // for (int i=0; i<8;i++) {
        // squares[i][1].add(new JLabel(new ImageIcon("PieceImages/bp.png")));
        // }
        // //Black Rooks
        // squares[0][0].add(new JLabel(new ImageIcon("PieceImages/br.png")));
        // squares[7][0].add(new JLabel(new ImageIcon("PieceImages/br.png")));
        // //Black Knights
        // squares[1][0].add(new JLabel(new ImageIcon("PieceImages/bn.png")));
        // squares[6][0].add(new JLabel(new ImageIcon("PieceImages/bn.png")));
        // //Black Bishops
        // squares[2][0].add(new JLabel(new ImageIcon("PieceImages/bb.png")));
        // squares[5][0].add(new JLabel(new ImageIcon("PieceImages/bb.png")));
        // //Black Queen
        // squares[3][0].add(new JLabel(new ImageIcon("PieceImages/bq.png")));
        // //Black King
        // squares[4][0].add(new JLabel(new ImageIcon("PieceImages/bk.png")));
    }

    public void buildBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JPanel();
                if ((i + j) % 2 == 0) {
                    squares[i][j].setBackground(java.awt.Color.WHITE);
                } else {
                    squares[i][j].setBackground(java.awt.Color.BLACK);
                }
                squares[i][j].setBounds(i * 100, j * 100, 100, 100);
                f.add(squares[i][j]);
                squares[i][j].addContainerListener(new ContainerListener() {

                    @Override
                    public void componentAdded(ContainerEvent e) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void componentRemoved(ContainerEvent e) {
                        // TODO Auto-generated method stub
                    }
                });
            }
        }

        f.setSize(815, 830);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void resetBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    squares[i][j].setBackground(java.awt.Color.WHITE);
                } else {
                    squares[i][j].setBackground(java.awt.Color.BLACK);
                }
            }
        }
    }

    public static void main(String[] args) {
        board b = new board();
        b.buildBoard();
        b.setPieces();
        chessPiece r = whiteQueen;
        for (GridPoint point : r.getValidMoves()) {
            System.out.println(point.getX() + " " + point.getY());
            getSquare(point).setBackground(java.awt.Color.RED);
        }
        System.err.println("Knight");
        Pieces.Knight k = new Pieces.Knight(Color.WHITE, new GridPoint(0, 0));
        for (GridPoint point : k.getValidMoves()) {
            System.out.println(point.getX() + " " + point.getY());
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        resetBoard();

    }

    public static JPanel getSquare(GridPoint point) {
        return squares[point.getX()][7 - point.getY()];
    }
}