package com.Nikhil.searching_interview_queation;

public class MountainArray {
    public static void main(String[] args) {
        int [] arr = {2, 4, 5, 10, 6, 3, 2};
        System.out.println(findAns(arr));
        // this only gives output when there is only local one peak value.
        // if the array has more than one peak value then it will only give the peak value at later end.
    }
    static int findAns(int [] arr){
        int start = 0, end = arr.length - 1;
        int mid = 0;
        while(start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // you are in increasing part of Array
                start = mid + 1;
            }
            else {
                // you are in decreasing part of Array
                // this may be the answer but look at left
                // this is why end != mid-1
                end = mid;
            }
        }
        return end;
        // or you can also return start;
    }
}