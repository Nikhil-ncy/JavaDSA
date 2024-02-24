package com.Nikhil.searching_interview_queation;
// thus program checks first and last index using different method
import java.util.Arrays;

public class Occurrence_of_a_number_pt2 {
    public static void main(String[] args) {
        int [] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int [] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        if (ans[0] > ans[1])
            System.out.println("Target not found.");
        else
            System.out.println("Your target lies at index "+ Arrays.toString(ans)+".");
    }
    static int search(int [] nums, int target, boolean isFirstIndex) {
        int start = 0, end = nums.length - 1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            if (nums[mid] < target)
                start = mid + 1;
            else if (nums[mid] > target)
                end = mid - 1;
            else {
                if (isFirstIndex) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
            if (isFirstIndex)
                return start;
            else
                return end;
    }
}