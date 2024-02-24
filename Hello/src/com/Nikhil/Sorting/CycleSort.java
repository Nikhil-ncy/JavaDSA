package com.Nikhil.Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int [] nums = {5, 3, 4, 1, 2};
        cycle(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cycle(int [] nums){
        int i = 0;
        while (i < nums.length - 1){
            int num = nums[i];
            if (num == (i+1)){
                i++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[num - 1];
                nums[num - 1] = temp;
            }
        }
    }
}
