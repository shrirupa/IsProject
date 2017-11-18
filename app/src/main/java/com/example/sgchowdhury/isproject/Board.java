package com.example.sgchowdhury.isproject;

/**
 * Created by Sumukh on 17-11-2017.
 */

public class Board {

    private int[][] boardArray;
    private Board previousState;

    public Board(int argBoardSize) {
        this.boardArray = new int[argBoardSize][argBoardSize];
    }

    public int[][] getBoardArray() {
        return boardArray;
    }

    public boolean isGoalStateReached() {
        return false;
    }
}
