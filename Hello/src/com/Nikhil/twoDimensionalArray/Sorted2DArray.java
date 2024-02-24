package com.Nikhil.twoDimensionalArray;

public class Sorted2DArray {
    public static void main(String[] args) {
        int [][] matrix = {
                {10, 20, 30, 40},
                {15, 24, 32, 43},
                {19, 25, 37, 46},
                {23, 29, 39, 49}
        };
        int target = 40;
        int [] ans = findElement(matrix, target);
        if (ans[0] == -1)
            System.out.println("Target not found.");
        else
            System.out.println("Your target is at "+(ans[0] + 1)+" row and "+(ans[1] + 1)+" column.");
    }
    static int [] findElement(int [][] matrix, int target){
        int row = 0, col = matrix.length - 1;
        // since it is a matrix so no of rows is equal to number of columns.
        // if size is N x M then col = matrix[0].length - 1;
        while (col != -1 && row != matrix.length){
            if (matrix[row][col] == target)
                return new int [] {row, col};
            else if (matrix[row][col] > target)
                col --;
            else if(matrix[row][col] < target)
                row ++;
        }
        return new int [] {-1, -1};
    }
}
