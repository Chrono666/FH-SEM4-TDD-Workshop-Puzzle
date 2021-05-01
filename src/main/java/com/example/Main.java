package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PuzzleBoard board = new PuzzleBoard();
        Helper helper = new Helper();
        Scanner scanner = new Scanner(System.in);


        int row = 6;
        int col = 6;
        char[][] puzzleBoard = board.initBoard(row, col);

        System.out.println("The following moves are possible: m - move, r - rotate 90° to the right, p - print on the current position");
        System.out.println("Please enter your movements in one line and without spaces: ");
//        String square = "mrmpmpmpmprrrmpmpmprrrmpmpmprrrmpmp";
//        String cross = "mmprmprmpmprrmmmpmpmprrmmmrrrmpmpmpmp";
        String input = scanner.next();

        if (helper.checkUserInput(input)) {
            board.gameLogic(input, puzzleBoard);
        }
    }

}
