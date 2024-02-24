package com.Nikhil.Recursion;

import java.util.ArrayList;

public class Test {
    public static int removeDuplicates(int[] arr) {
        int k = 0;
        int i = 1;
        while(i < arr.length - 1){
            if(arr[i] == arr[k]){
                if(arr[k + 1] < arr[k]){
                    //swap arr[k + 1] and arr[i]
                    int temp = arr[i];
                    arr[i] = arr[k + 1];
                    arr[k + 1] = temp;
                    k += 1;
                }
                i++;
            }
            else if(arr[i] > arr[k]){
                if(arr[k] > arr[k + 1]){
                    //swap arr[k + 1] and arr[i]
                    int temp = arr[i];
                    arr[i] = arr[k + 1];
                    arr[k + 1] = temp;
                    k += 1;
                }
                else{
                    //swap arr[k + 2] and arr[i]
                    int temp = arr[i];
                    arr[i] = arr[k + 2];
                    arr[k + 2] = temp;
                    k += 2;
                }
            }
            else if(arr[i] < arr[k]){
                if(arr[i] == arr[i + 1]){
                    i++;
                }
                else{
                    //swap arr[i + 1] and arr[i]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    i++;
                }
            }
        }
        return (k + 1);
    }

    public static void main(String[] args) {
        int [] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(nums));
    }
}
