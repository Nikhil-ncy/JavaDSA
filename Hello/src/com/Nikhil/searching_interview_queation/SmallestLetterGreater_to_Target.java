package com.Nikhil.searching_interview_queation;

public class SmallestLetterGreater_to_Target {
    public static void main(String[] args)
    {
        char [] arr = {'a' ,'b'};
        char target = 'f';
        System.out.println("Answer is "+smallestLetterGreaterThanTarget(arr, target));
    }
    static char smallestLetterGreaterThanTarget(char [] arr, int target)
    {
        int start = 0, end = arr.length - 1;
        int mid = 0;

        while (start <= end)
        {
            mid = start + (end-start) / 2;
            // assuming array in ascending order
            if (arr[mid] < target)
                start = mid + 1;
            else if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] == target) {
                start = mid+1;
            }
        }
        /** if (start == arr.length)
            return arr[0];
        return arr[start]; **/
        return arr[start % arr.length]; // better solution
    }
}