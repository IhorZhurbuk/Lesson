package com.dz;

import java.util.Scanner;

public class Pudge {
    public static void main(String[] args) {
        final int GAME_LENGTH = 10;
        char[][] board = new char[GAME_LENGTH][GAME_LENGTH];
        int position = 0;
        int position2 = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '_';

            }
        }
        board[position][position2] = '@';
        Scanner scanner = new Scanner(System.in);
        do {


            switch (scanner.nextLine()) {
                case "a":
                    if(board[position][position2] == -1) {
                        board[position][position2] = '@';
                    }
                    board[position][position2--] = '_';
                    board[position][position2] = '@';
                    break;
                case "w":
                    board[position--][position2] = '_';
                    board[position][position2] = '@';
                    break;
                case "s":
                    board[position++][position2] = '_';
                    board[position][position2] = '@';
                    break;
                case "d":
                    board[position][position2++] = '_';
                    board[position][position2] = '@';
                    break;
                default:
                    break;
            }
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + "\t");
                }
                System.out.println();
            }
        } while ((position + position2) != 18);
        System.out.println("Game over!");
        scanner.close();
    }
}
