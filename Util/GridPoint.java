package Util;

import java.awt.List;
import java.util.ArrayList;

public class GridPoint {
    private int x;
    private int y;

    public GridPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public GridPoint() {
        this.x = 0;
        this.y = 0;
    }
    public static GridPoint kZero = new GridPoint(); // this may look like Pose2D but like ignore that

    public boolean equals(GridPoint other) {
        return this.x == other.x && this.y == other.y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public GridPoint plus(GridPoint other) {
        return new GridPoint(this.x + other.x, this.y + other.y);
    }
    public GridPoint minus(GridPoint other) {
        return new GridPoint(this.x - other.x, this.y - other.y);
    }
    public GridPoint times(int scalar) {
        return new GridPoint(this.x * scalar, this.y * scalar);
    }
    public GridPoint div(int scalar) {
        return new GridPoint(this.x / scalar, this.y / scalar);
    }
    public double distance(GridPoint other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
    public GridPoint nearest(ArrayList<GridPoint> points) {
        GridPoint nearest = points.get(0);
        for (GridPoint point : points) {
            if (this.distance(point) < this.distance(nearest)) {
                nearest = point;
            }
        }
        return nearest;
    } //IDK if well use this but like I saw it in WPI Pose2D and thought why not
    public boolean inBoard() {
        return this.x >= 0 && this.x < 8 && this.y >= 0 && this.y < 8;
    }

}