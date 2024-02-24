package com.Nikhil.twoDimensionalArray;

import java.util.Arrays;

public class CountSmallerNumberRighttoNumber {

    public static void main(String[] args) {
        int [] nums = {-1, -1};
        System.out.println(Arrays.toString(countSmaller(nums)));
    }
    static int [] countSmaller(int[] nums) {
        int [] list = new int[nums.length];
        int c = 0, k = 0;
        while(true){
            for(int i = c; i <= nums.length - 1; i++){
                if(c == nums.length - 1){
                    list[nums.length - 1] = 0;
                    return list;
                }
                if(nums[i] < nums[c]){
                    k++;
                }
            }
            list[c] = k;
            c++;
            k = 0;
        }
    }
}
