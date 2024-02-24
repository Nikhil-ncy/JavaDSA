package com.Nikhil.searching_interview_queation;

import java.util.Scanner;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println("Enter the target: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int answer = findCeiling(arr, target);
        if (answer == -1) {
            System.out.println("No number is greater than this");
            System.exit(0);
        }
        System.out.println("Answer is: "+arr[answer]);
    }
    static int findCeiling(int[] arr, int target){
        int start = 0, end = arr.length-1;
        int mid = 0;
        while (start <= end){
            mid = start + (end-start) / 2;
            if(arr[mid]<target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else if (arr[mid] == target)
                return mid;
        }
        if (start == arr.length)
            return -1;
        return start;
    }
}
