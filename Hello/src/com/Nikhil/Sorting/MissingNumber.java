package com.Nikhil.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {8, 8, 8, 8, 8, 8, 8, 8};
        System.out.println(missingNumbers(nums));
    }
    static List<Integer> missingNumbers(int [] nums){
        // numbers are from 1 to N
        // sort the array using cycle sort
        // nums = {7, 2, 1, 6, 8, 4, 4, 1}
        // missing = [3, 5]

        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (i != correctIndex && nums[correctIndex] != nums[i]){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        // assume last number is N.
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != (index + 1)){
                ans.add(index + 1);
            }
        }
        return ans;
    }
    static void swap(int [] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
