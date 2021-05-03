package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class PuzzleBoardTest {

    PuzzleBoard puzzleBoard;

    @BeforeEach
    void setUp() {
        puzzleBoard = new PuzzleBoard();
    }

    @Test
    void initBoard() {
        int row = 16;
        int col = 16;

        char[][] actualBoard = puzzleBoard.initBoard(row, col);

        char[][] expectedBoard = new char[row][col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                expectedBoard[i][j] = '-';
            }
        }

        assertArrayEquals(expectedBoard, actualBoard);
    }

    @Test
    void gameLogic() {
        int row = 4;
        int col = 4;
        String commands = "mmrmpmrrrmp";

        char[][] actualBoard = puzzleBoard.initBoard(row, col);
        actualBoard = puzzleBoard.gameLogic(commands, actualBoard);

        char[][] expectedBoard = {
                {'-', '-', '-', '-'},
                {'-', '-', 'X', '-'},
                {'-', '-', '-', 'X'},
                {'-', '-', '-', '-'},
        };

        assertArrayEquals(expectedBoard, actualBoard);
    }
}
