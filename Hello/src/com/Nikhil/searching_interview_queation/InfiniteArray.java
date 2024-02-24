package com.Nikhil.searching_interview_queation;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 7, 8, 10, 12, 16, 20, 22, 24, 27, 30, 34};
        int target = 30;
        System.out.println(ans(arr, target));
    }
    static int ans(int [] arr, int target){
        int start = 0, end = 1;
        boolean check = true;
        // first check two box
        while(check) {
            try {
                if (target > arr[end] && start <= end) {
                    int newStart = end + 1;
                    // new start index for next set of values
                    end = end + (end - start + 1) * 2;
                    start = newStart;
                }
                else {
                    check = false;
                }
            }
            catch (Exception e){
                end = end - 1;
            }
        }
        return findIndex(arr, target, start, end);
    }
    static int findIndex(int [] arr, int target, int start, int end){
        int mid = 0;
        while (start <= end){
            mid = start + (end-start) / 2;
            if(arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else if (arr[mid] == target)
                return mid;
        }
        return -1;
    }
}