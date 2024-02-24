package com.Nikhil.searching_interview_queation;
import java.util.Arrays;

public class OccurenceOfA_Number
{
    public static void main(String[] args)
    {
//        int [] nums = {1, 3, 6, 8, 8, 8, 8, 9};
        int [] nums = {8, 8, 8, 8, 8};
        int target = 8;
        int [] ans = findOccurrence(nums, target);
        System.out.println("The index of occurrences of "+target+" is/are: "+ Arrays.toString(ans));
    }
    static int [] findOccurrence(int [] nums, int target)
    {
        int start = 0, end = nums.length - 1, mid = 0;
//        int [] ans = new int[nums.length];
        boolean found = false;
        while(start <= end)
        {
            mid = start + (end - start)/2;
            // assuming array in ascending order
            if(nums[mid] < target)
                start = mid + 1;
            else if(nums[mid] > target)
                end = mid - 1;
            else
            {
                found = true;
                start = mid;
                break;
            }
        }
        if (found)
        {
//            int c = start;
            int s = start, e = start;
            while(nums[s] == target)
            {
                s--;
                if (s == -1)
                    break;
            }
            while(nums[e] == target)
            {
                e++;
                if (e == nums.length)
                    break;
            }
            int[] ans = new int[2];
            ans[0] = s + 1;
            ans[1] = e - 1;
            if (ans[0] == ans[1])
                return new int []{ans[0]};
            else
                return ans;
        }
        else
            return new int[] {-1, -1};
    }
}
