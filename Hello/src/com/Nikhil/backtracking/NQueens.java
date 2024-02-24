package com.Nikhil.backtracking;

public class NQueens {

    public static void main(String args[]){

        int n = 4;
        boolean[][] board = new boolean[n][n];
        int ans = queens(board, 0);
        System.out.println(ans);
    }

    static int queens(boolean [][] board, int row){

        if (row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;

        for (int col = 0; col < board.length; col++){
            // place the queen if it is safe

            if (isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;

    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        //check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                // it is not safe to place the queen over there
                return false;
            }
        }

        // check right side
        int maxRight = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }

        //check left side
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row-i][col-i]){
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board) {

        for (boolean [] row: board){
            for (boolean val: row){
                if (val){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

    }
}
