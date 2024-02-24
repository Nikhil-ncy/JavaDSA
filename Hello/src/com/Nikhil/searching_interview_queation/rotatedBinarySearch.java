package com.Nikhil.searching_interview_queation;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr ={4, 5, 6, 7, 0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3};
//        int [] arr ={0, 1, 2, 3, 4, 5, 6, 7};
        int target = 7;
        int pivot = findPivotWithDuplicates(arr);
        System.out.println("Pivot is at: "+pivot);
        int ans = 0;

        if (target >= arr[0]){
            ans = binarySearch(arr, target, 0, pivot);
        }
        else if (target < arr[0]) {
            ans = binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
        if (ans == -1)
            System.out.println("Target not found.");
        else
            System.out.println("Target is at: "+ans);
    }
    static int findPivot(int [] arr){
        int start = 0, end = arr.length - 1;
        int mid = 0;
        while (start <= end){
            mid = start + (end-start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            else if (arr[start] < arr[mid]) {
                start = mid + 1;
            }
            else if (arr[start] > arr[mid]) {
                end = mid - 1;
            }
            // this will run even if array is not rotated
            else if (start == arr.length - 2 && end == arr.length - 1) {
                return end;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int [] arr){
        int start = 0, end = arr.length - 1;
        int mid = 0;
        while (start <= end){
            mid = start + (end-start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            else if (arr[start] == arr[mid] && arr[mid] == arr[end]){
                if (arr[start] > arr[start + 1])
                    return start;
                start++;
                if (arr[end] < arr[end - 1])
                    return end;
                end--;
            }
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    static int binarySearch(int [] arr, int target, int start, int end){
        int mid = 0;
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
}
