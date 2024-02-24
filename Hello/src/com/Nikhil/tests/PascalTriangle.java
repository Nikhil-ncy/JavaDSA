package com.Nikhil.tests;

import java.util.*;

public class PascalTriangle {

    public static void main(String[] args) {
        int[][] ans = pascalTriangle(4);
        for (int[] i: ans){
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int [][] pascal = new int[N][];
        int i;
        int j;
        for(i = 0; i < N; i++){
            pascal[i] = new int[i+1];

            for(j = 0; j < i+1; j++){
                if(j == 0){
                    pascal[i][j] = 1;
                }

                for(int k = 0; k < i; k++){
                    if(k == i-1){
                        pascal[i][k+1] = 1;
                        break;
                    }
                    pascal[i][k+1] = pascal[i-1][k] + pascal[i-1][k+1];
                }
            }
        }
        return pascal;
    }

    public static List<List<Integer>> generate(int numRows) {
        // using list of lists method

        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        int i;
        int j;
        for(i = 0; i < numRows; i++){
            pascal.add(new ArrayList<Integer>());
            for(j = 0; j < i+1; j++){
                if(j == 0){
                    pascal.get(i).add(1);
                }

                else{
                    if(j == i){
                        pascal.get(i).add(1);
                        break;
                    }
                    pascal.get(i).add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
                }
            }
        }
        return pascal;
    }
}
