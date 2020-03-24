package model;

public class Tile {
    private int row;
    private int column;
    private boolean mine;
    private boolean flagged;
    private boolean visible;
    private int value;

    public Tile(int r, int c)
    {
        row = r;
        column = c;
    }

}
