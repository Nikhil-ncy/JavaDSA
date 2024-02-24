package com.Nikhil.tests;

import java.util.*;
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }

        int[] sum = new int[len];
        sum[0] = nums[0];
        // fill the array sum

        for(int i = 1; i < len; i++){
            sum[i] = sum[i-1] + nums[i];
        }

        int ans = sum[0];
        for(int i = 0; i < len; i++){
            for(int j = len-1; j >= i; j--){
                int temp;

                if(i == 0){
                    temp = sum[j];
                }
                else{
                    temp = sum[j] - sum[i-1];
                }

                if(temp > ans){
                    ans = temp;
                }
            }
        }
        return ans;
    }
}
