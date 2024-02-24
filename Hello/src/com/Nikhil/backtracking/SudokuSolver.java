package com.Nikhil.backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }
    static boolean solve(int [][] sudoku){
        int n = sudoku.length;
        // first find the row and col of empty value
        int row = -1;
        int col = -1;
        
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sudoku[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if found some empty element in the row then break
            if (emptyLeft == false){
                break;
            }
        }
        if (emptyLeft == true){
            return true;
            //sudoku is solved
        }

        //backtrack
        for (int number = 1; number <= sudoku.length; number++) {
            if (isSafe(sudoku, row, col, number)){
                sudoku[row][col] = number;
                if (solve(sudoku)){
                    return true;
                }
                else{
                    sudoku[row][col] = 0;
                }
            }
        }
        return false;

    }

    static boolean isSafe(int [][] sudoku, int row, int col, int num){

        // check for safety in the row
        for (int i = 0; i < sudoku.length; i++){
            if (sudoku[row][i] == num){
                return false;
            }
        }

        // check for safety in the col
        for (int [] r: sudoku){
            if (r[col] == num){
                return false;
            }
        }
        // check for safety in the current square box
        int sqrt = (int)(Math.sqrt(sudoku.length));
        int rowStart = row - (row % sqrt);
        int colStart = col - (col % sqrt);

        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if (sudoku[i][j] == num){
                    return false;
                }
            }
        }

        // if the number is safe to be placed then return true;
        return true;
    }
    static void display(int [][] sudoku){
        for (int[] row: sudoku){
            for (int element: row){
                System.out.print(element+"  ");
            }
            System.out.println();
        }
    }
}
