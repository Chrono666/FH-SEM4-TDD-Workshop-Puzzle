package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         PuzzleBoard board = new PuzzleBoard();
        Utility utility = new Utility();
        String square = "mrmpmpmpmprrrmpmpmprrrmpmpmprrrmpmp";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the rows and columns of the puzzle gird: ");
        System.out.print("Rows: ");
        int row = scanner.nextInt();
        System.out.print("Columns: ");
        int col = scanner.nextInt();
        char[][] puzzleBoard = board.initBoard(row, col);
        System.out.println("The following moves are possible: m - move, r - rotate 90° to the right, p - print on the current position");
        System.out.println("Please enter your movements in one line and without spaces: ");
        String input = scanner.next();
        board.gameLogic(input, puzzleBoard);
    }

}
