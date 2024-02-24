package com.Nikhil.Sorting;
import java.util.*;
public class MergeSort {

    public static void main(String[] args) {
        int [] arr = {};
        int [] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergeSort(int[] arr){

        if (arr.length <= 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        int f = 0;
        int s = 0;
        int[] ans = new int[left.length + right.length];
        int c = 0;
        while(f != left.length && s != right.length){

            if (left[f] <= right[s]){
                ans[c++] = left[f++];
            }
            else{
                ans[c++] = right[s++];
            }
        }

        while(f != left.length){
            ans[c++] = left[f++];
        }

        while(s != right.length){
            ans[c++] = right[s++];
        }
        return ans;
    }
}
