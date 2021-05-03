package com.example;


public class PuzzleBoard {
    private int px = 0;
    private int py = 0;
    private int r = 0;

    public char[][] initBoard(int row, int col) {
        char[][] board = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = '-';
            }
        }
        return board;
    }

    public void printBoard(char[][] board) {
        for (char[] x : board) {
            for (char y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    private void move() {
        if (r == 0) {
            px++;
        } else if (r == 1) {
            py++;
        } else if (r == 2) {
            px--;
        } else if (r == 3) {
            py--;
        }
    }

    private void rotateRight() {
        r++;
        if (r >= 4) {
            r = 0;
        }
    }

    private void printSquare(char[][] puzzleBoard) {
        puzzleBoard[py][px] = 'X';
    }

    public char[][] gameLogic(String input, char[][] puzzleBoard) {
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'm':
                    move();
                    break;
                case 'r':
                    rotateRight();
                    break;
                case 'p':
                    printSquare(puzzleBoard);
                    break;
                default:
                    break;
            }
        }

        return puzzleBoard;
    }
}
