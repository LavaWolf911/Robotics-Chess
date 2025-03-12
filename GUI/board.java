
package GUI;

import Util.GridPoint;
import Util.PieceConstants;
import java.awt.*;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class board {
    Toolkit t = Toolkit.getDefaultToolkit();
    static JFrame f = new JFrame();
    static JPanel[][] squares = new JPanel[8][8];

    ImageIcon whitePawn = new ImageIcon("PieceImages/wp.png");
    // Defining pawns
    // Pawn wAPawn = new Pawn(new Pose2d(0,1));
    // Pawn wBPawn = new Pawn(new Pose2d(1,1));
    // Pawn wCPawn = new Pawn(new Pose2d(2,1));
    // Pawn wDPawn = new Pawn(new Pose2d(3,1));
    // Pawn wEPawn = new Pawn(new Pose2d(4,1));
    // Pawn wFPawn = new Pawn(new Pose2d(5,1));
    // Pawn wGPawn = new Pawn(new Pose2d(6,1));
    // Pawn wHPawn = new Pawn(new Pose2d(7,1));
    // Rook wARook = new Rook(new Pose2d(0,0));
    // Rook wHRook = new Rook(new Pose2d(7,0));
    // Knight wBKnight = new Knight(new Pose2d(1,0));
    // Knight wGKnight = new Knight(new Pose2d(6,0));
    // Bishop wCBishop = new Bishop(new Pose2d(2,0));
    // Bishop wFBishop = new Bishop(new Pose2d(5,0));
    // Queen wQueen = new Queen(new Pose2d(3,0));
    // King wKing = new King(new Pose2d(4,0));

    public board() {

    }

    public void setPieces() throws MalformedURLException {
        for (int i = 0; i < 8; i++) {
            squares[i][6].add(createResizedLabel(PieceConstants.imageURLS.wPawn.toURL(), 100, 100));
            squares[i][6].revalidate();
            squares[i][6].repaint();
        }

        // White Rooks
        squares[0][7].add(createResizedLabel(PieceConstants.imageURLS.wRook.toURL(), 100, 100));
        squares[0][7].revalidate();
        squares[0][7].repaint();

        squares[7][7].add(createResizedLabel(PieceConstants.imageURLS.wRook.toURL(), 100, 100));
        squares[7][7].revalidate();
        squares[7][7].repaint();

        // White Knights
        squares[1][7].add(createResizedLabel(PieceConstants.imageURLS.wKnight.toURL(), 100, 100));
        squares[1][7].revalidate();
        squares[1][7].repaint();

        squares[6][7].add(createResizedLabel(PieceConstants.imageURLS.wKnight.toURL(), 100, 100));
        squares[6][7].revalidate();
        squares[6][7].repaint();

        // White Bishops
        squares[2][7].add(createResizedLabel(PieceConstants.imageURLS.wBishop.toURL(), 100, 100));
        squares[2][7].revalidate();
        squares[2][7].repaint();

        squares[5][7].add(createResizedLabel(PieceConstants.imageURLS.wBishop.toURL(), 100, 100));
        squares[5][7].revalidate();
        squares[5][7].repaint();

        // White Queen
        squares[3][7].add(createResizedLabel(PieceConstants.imageURLS.wQueen.toURL(), 100, 100));
        squares[3][7].revalidate();
        squares[3][7].repaint();

        // White King
        squares[4][7].add(createResizedLabel(PieceConstants.imageURLS.wKing.toURL(), 100, 100));
        squares[4][7].revalidate();
        squares[4][7].repaint();

        // Black Pawns
        for (int i = 0; i < 8; i++) {
            squares[i][1].add(createResizedLabel(PieceConstants.imageURLS.bPawn.toURL(), 100, 100));
            squares[i][1].revalidate();
            squares[i][1].repaint();
        }

        // Black Rooks
        squares[0][0].add(createResizedLabel(PieceConstants.imageURLS.bRook.toURL(), 100, 100));
        squares[0][0].revalidate();
        squares[0][0].repaint();

        squares[7][0].add(createResizedLabel(PieceConstants.imageURLS.bRook.toURL(), 100, 100));
        squares[7][0].revalidate();
        squares[7][0].repaint();

        // Black Knights
        squares[1][0].add(createResizedLabel(PieceConstants.imageURLS.bKnight.toURL(), 100, 100));
        squares[1][0].revalidate();
        squares[1][0].repaint();

        squares[6][0].add(createResizedLabel(PieceConstants.imageURLS.bKnight.toURL(), 100, 100));
        squares[6][0].revalidate();
        squares[6][0].repaint();

        // Black Bishops
        squares[2][0].add(createResizedLabel(PieceConstants.imageURLS.bBishop.toURL(), 100, 100));
        squares[2][0].revalidate();
        squares[2][0].repaint();

        squares[5][0].add(createResizedLabel(PieceConstants.imageURLS.bBishop.toURL(), 100, 100));
        squares[5][0].revalidate();
        squares[5][0].repaint();

        // Black Queen

        squares[3][0].add(createResizedLabel(PieceConstants.imageURLS.bQueen.toURL(), 100, 100));
        squares[3][0].revalidate();
        squares[3][0].repaint();

        // Black King

        squares[4][0].add(createResizedLabel(PieceConstants.imageURLS.bKing.toURL(), 100, 100));

        squares[4][0].revalidate();
        squares[4][0].repaint();

    }

    // Helper method to create a resized JLabel
    private JLabel createResizedLabel(URL imageURL, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(imageURL);
        Image resizedImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new JLabel(new ImageIcon(resizedImage));
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

    public static void main(String[] args) throws MalformedURLException {
        board b = new board();
        b.buildBoard();
        b.setPieces();
        // Rook r = new Rook(Color.WHITE, new GridPoint(5, 3));
        // for (GridPoint point : r.getValidMoves()) {
        //     System.out.println(point.getX() + " " + point.getY());
        //     getSquare(point).setBackground(java.awt.Color.RED);
        // }
        // System.err.println("Knight");
        // Pieces.Knight k = new Pieces.Knight(Color.WHITE, new GridPoint(0, 0));
        // for (GridPoint point : k.getValidMoves()) {
        //     System.out.println(point.getX() + " " + point.getY());
        // }
    }

    public static JPanel getSquare(GridPoint point) {
        return squares[point.getX()][7 - point.getY()];
    }
}