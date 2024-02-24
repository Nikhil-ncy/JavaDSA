package com.Nikhil.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] nums = {};
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void insertion(int [] nums){
        int steps = 0;
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j > 0; j--){
                if (nums[j] < nums[j - 1]){
                    steps++;
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
                else
                    break;
            }
        }
        System.out.println("Number of steps = "+steps);
    }
}
