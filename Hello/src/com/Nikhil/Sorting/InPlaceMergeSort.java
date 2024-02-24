package com.Nikhil.Sorting;

import java.util.*;

public class InPlaceMergeSort {

    public static void main(String[] args) {
        int [] arr = {4, 6, 3, 9, 1, 2};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int start, int end){

        if (start == end){
            return;
        }
    }
}
