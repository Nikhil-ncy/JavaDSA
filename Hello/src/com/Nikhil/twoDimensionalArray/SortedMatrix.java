package com.Nikhil.twoDimensionalArray;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 9;
        int [] ans = search(matrix, target);
        if (ans[0] == -1)
            System.out.println("Target not found.");
        else
            System.out.println("Your target is at: "+ Arrays.toString(ans));
    }

    static int[] binarySearch(int [][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            else if (matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int [] search(int [][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, check for empty array
        if (rows == 1){
            // if only one row is there in the matrix.
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int mid = (cols - 1) / 2;

        while (rStart < (rEnd - 1)){
            // get 2 rows to reduce searching space

            int rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][mid] == target){
                return new int[]{rMid, mid};
            }
            if (matrix[rMid][mid] < target) {
                rStart = rMid;
            }
            else {
                rEnd = rMid;
            }
        }
        // now we have got 2 rows, time to find the target in the remaining 2 rows
        // firstly, find in the middle column
        if (target == matrix[rStart][mid]){
            return new int[]{rStart, mid};
        }
        else if (target == matrix[rStart + 1][mid]){
            return new int[]{rStart + 1, mid};
        }

        // find in the 1st part
        if (target <= matrix[rStart][mid - 1]){
            return binarySearch(matrix, rStart, 0, mid - 1, target);
        }
        // find in the 2nd part
        else if (target >= matrix[rStart][mid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, mid + 1, cols - 1, target);
        }
        // find in the 3rd part
        else if (target <= matrix[rStart + 1][mid - 1]){
            return binarySearch(matrix, rStart + 1, 0, mid - 1, target);
        }
        // find in the 4th part
        else{
            return binarySearch(matrix, rStart + 1, mid + 1, cols - 1, target);
        }
    }
}