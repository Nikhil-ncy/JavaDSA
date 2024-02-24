package com.Nikhil.Recursion;

public class BS {
    public static void main(String[] args) {
        int [] nums = {3, 5, 7, 8, 9, 15, 28};
        int target = 9;
        System.out.println("Your target number is at: "+binarySearch(nums, 0, nums.length - 1, target));
    }
    static int binarySearch(int [] nums, int start, int end, int target){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (nums[mid] == target){
            return mid;
        }
        else if (nums[mid] > target){
            return binarySearch(nums, start, mid - 1, target);
        }
        else{
            return binarySearch(nums, mid + 1, end, target);
        }
    }
}
