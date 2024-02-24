package com.Nikhil.tests;

import java.util.*;
public class StriverSheetQ1 {

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        // Write your code here.

        if(n < 1 || m < 1){
            return matrix;
        }

        ArrayList<ArrayList<Integer>> ans = copyList(matrix);
        // check for 0 and make complete row cointaining 0 as 0
        for(int i = 0; i < n; i++){

            if(containZero(matrix.get(i), ans)){
                makeRowZero(ans, i);
            }
        }
        return ans;
    }

    public static ArrayList<ArrayList<Integer>> copyList(ArrayList<ArrayList<Integer>> list){
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
        for(ArrayList<Integer> i : list){
            list2.add(new ArrayList<Integer>(i));
        }
        return list2;
    }

    public static boolean containZero(ArrayList<Integer> row, ArrayList<ArrayList<Integer>> matrix){
        int c = 0;
        for(int i = 0; i < row.size(); i++){
            if(row.get(i) == 0){
                c++;
                makeColZero(matrix, i);
            }
        }
        if (c == 0){
            return false;
        }
        return true;
    }

    public static void makeRowZero(ArrayList<ArrayList<Integer>> matrix, int row){
        for(int i = 0; i < matrix.get(0).size(); i++){
            matrix.get(row).set(i, 0);
        }
    }

    public static void makeColZero(ArrayList<ArrayList<Integer>> matrix, int col){
        for(int i = 0; i < matrix.size(); i++){
            matrix.get(i).set(col, 0);
        }
    }

    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(2);
        list.add(new ArrayList<Integer>(Arrays.asList(2, 4, 3)));
        list.add(new ArrayList<Integer>(Arrays.asList(1, 0, 0)));
        list.add(new ArrayList<Integer>(Arrays.asList(1, 4, 9)));
        list.add(new ArrayList<Integer>(Arrays.asList(1, 4, 9)));

//        System.out.println(zeroMatrix(list, 3, 3));
        System.out.println("Original matrix");
        printList(list);
        list = zeroMatrix(list, 4, 3);
        System.out.println("Changed matrix");
        printList(list);
    }

    public static void printList(ArrayList<ArrayList<Integer>> matrix){
        for (int i = 0; i < matrix.size(); i++){
            System.out.println(matrix.get(i));
        }
    }
}
