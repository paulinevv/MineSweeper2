package model;

import gameinterface.Location;

import java.util.Random;

public class MyLocation implements Location{

    private int row;
    private int column;

    public MyLocation(int r, int c)
    {
        row = r;
        column = c;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
