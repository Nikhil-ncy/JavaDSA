package com.Nikhil.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] nums = {3, 1, 5, 4, 2};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bubbleSort(int [] nums){
        boolean swapped;
        for (int i = 0; i < nums.length - 1; i++){
            swapped = false;
            for (int j = 1; j <= nums.length - 1 - i; j++){
                if (nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            // if no swapping has occurred for the ith counter, it means that the array is already sorted so just break
            if (!swapped){
                break;
            }
        }
    }
}
