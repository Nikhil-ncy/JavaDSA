package com.Nikhil.Recursion;

public class ArraySorted {
    public static void main(String[] args) {
        int [] nums = {1, 2, 4, 8, 9, 12};
        helper(nums);
    }
    static void helper(int [] nums){
        if(check(nums, 0)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
    static boolean check(int [] nums, int index){
        if (index == nums.length - 1){
            return true;
        }
        if (nums[index] < nums[index + 1]) {
            return check(nums, index + 1);
        }
        else {
            return false;
        }
        // another method
        //return ((nums[index] < nums[index + 1]) && check(nums, index + 1));
    }
}
