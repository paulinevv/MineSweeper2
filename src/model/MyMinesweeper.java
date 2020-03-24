package model;

import gameinterface.InvalidRangeException;
import gameinterface.Location;
import gameinterface.MineSweeperModel;
import sun.jvm.hotspot.LinuxVtblAccess;

import java.util.ArrayList;
import java.util.Random;


public class MyMinesweeper implements MineSweeperModel{
    private int width;
    private int height;
    private int mines;
    private Tile[][] board;

    private boolean lost;
    private int actions;

    public MyMinesweeper(int w, int h) throws InvalidRangeException {
        width = w;
        height = h;
        createBoard(w, h, 0);
    }

    public MyMinesweeper(int w, int h, int m) throws InvalidRangeException {
       if(w < 1 || h < 1 || m > (w*h))
       {
           throw new InvalidRangeException();
       }
        width = w;
        height = h;
        mines = m;
        createBoard(w, h, m);
        lost = false;
        actions = 0;
    }

    public void createBoard(int w, int h, int m) {
        board = new Tile[w][h];
        for (int x = 0; x < w; x++) {
            for (int y = 0; y < h; y++) {
                Tile b = new Tile(x, y);
                board[w][h] = b;
            }
        }
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getValueAt(Location location) {
        return null;
    }

    @Override
    public void checkLocation(Location location) {

    }

    @Override
    public void flagLocation(Location location) {

    }

    @Override
    public int getNrOfActions() {
        return 0;
    }

    @Override
    public long getNrOfMinesLeft() {
        return 0;
    }

    @Override
    public boolean getLost() {
        return false;
    }

    @Override
    public void printBoard() {

    }
}
