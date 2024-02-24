package com.Nikhil.searching_interview_queation;

public class FindValueInMountain {
    public static void main(String[] args) {
        int [] arr = {1, 4, 6, 8, 9, 6, 4, 3, 2, 0};
        int target = 2;
        System.out.println(findAns(arr, target));
    }
    static int findAns(int [] arr, int target){
        // first find the peak value in the array.
        int peak = peakIndexofMountain(arr);
        System.out.println("Peak index: "+peak);

        // after getting peak value, find the target in left half i.e., ascending part
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1)
            return firstTry;

        // if not found in the left half, find in the right half i.e., descending part
        return orderAgnosticBS(arr, target, peak, arr.length-1);
    }
    static int peakIndexofMountain(int [] arr){
        int start = 0, end = arr.length - 1;
        int mid = 0;
        while (start < end){
            mid = start + (end-start)/2;
            if (arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
    static int orderAgnosticBS(int [] arr, int target, int start, int end){
        int mid = 0;
        if (arr[start] < arr[end]){
            while (start <= end){
                mid = start + (end-start)/2;
                if (target > arr[mid])
                    start = mid + 1;
                else if (target < arr[mid])
                    end = mid - 1;
                else
                    return mid;
            }
            return -1;
        }
        else{
            while (start <= end){
                mid = start + (end-start)/2;
                if (target < arr[mid])
                    start = mid + 1;
                else if (target > arr[mid])
                    end = mid - 1;
                else
                    return mid;
            }
            return -1;
        }
    }
}
