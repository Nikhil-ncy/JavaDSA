package com.Nikhil.tests;

import java.lang.reflect.Array;
import java.util.*;
public class LexicographicPermutations {

    public static void nextPermutation(int[] nums) {
        if(nums.length < 2){
            return;
        }

        int dIndex = -1;
        for(int i = 0; i < nums.length-1; i++){

            if(nums[i] > nums[i+1]){
                dIndex = i;
                break;
            }
        }

        int temp;
        if(dIndex == -1){
            // swap the last element with the second last one
            temp = nums[nums.length - 1];
            nums[nums.length - 1] = nums[nums.length - 2];
            nums[nums.length - 2] = temp;
            return;
        }

        else{
            int s = nums[findSmallest(nums, dIndex)];
            //swap nums[dIndex-1] and nums[s]
            temp = nums[dIndex-1];
            nums[dIndex-1] = nums[s];
            nums[s] = temp;

            // sort the array starting from dIndex till the last
            sortNums(nums, dIndex);
        }
    }

    public static int findSmallest(int[] nums, int index){
        int s = index;
        for(int i = index+1; i < nums.length; i++){
            if(nums[s] > nums[i]){
                s = i;
            }
        }
        return s;
    }

    public static void sortNums(int[] nums, int index){
        for(int i = index; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
