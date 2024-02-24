package com.Nikhil.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] nums = {4, 5, 1, 2, 3};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void selectionSort(int [] nums){
        for (int i = 0; i < nums.length - 1; i++){
            int c = 0;
            for (int j = 1; j <= nums.length - i - 1; j++){
                if (nums[j] > nums[c]){
                    c = j;
                }
            }
            int temp = nums[c];
            nums[c] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
    }
}
