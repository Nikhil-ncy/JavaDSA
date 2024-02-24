package com.Nikhil.searching_interview_queation;

public class SplitArrayMaxSum {
    public static void main(String[] args) {
        int [] nums = {7, 2, 5, 8, 10};
        int m = 3;
        if (splitArray(nums, m) == -1)
            System.out.println("Number of subarrays is greater than length of array.");
        else
            System.out.println("Maximum sum among "+m+" subarrays is: "+splitArray(nums, m));
    }
    static int splitArray(int [] nums, int k){
        if (k > nums.length)
            return -1;
        int start = 0, end = 0;
        int mid = 0;
        for(int num: nums){
            start = Math.max(start, num);
            end += num;
        }
//        System.out.println("Start: "+start);
//        System.out.println("end: "+end);

        while (start < end){
            mid = start +(end - start) / 2;
            int pieces = 1, sum = 0;

            for (int num: nums){
                if (sum + num > mid){
                    sum = num;
                    pieces ++;
                }
                else{
                    sum += num;
                }
            }
            if (pieces > k){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}
