package com.Nikhil.searching_interview_queation;

public class RotationCount {
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 0, 1, 2, 3};
//        int [] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int pivot = findPivot(arr);
        if (pivot == -1)
            System.out.println("Your array is not rotated.");
        else
            System.out.println("Your array is rotated "+(pivot + 1)+" times.");
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
            else{
                end = mid - 1;
            }
            // this will run even if array is not rotated

        }
        return -1;
    }
}
