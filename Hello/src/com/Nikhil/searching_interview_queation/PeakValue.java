package com.Nikhil.searching_interview_queation;

public class PeakValue {
    public static void main(String[] args) {
        int [] arr = {2, 3, 7, 8, 6, 3, 1, 5, 7, 9, 4, 0};
        System.out.println(giveBlock(arr));
    }
    static int giveBlock(int [] arr){
        int start = 0, end = 1;
        int ans = 0;
        boolean proceed = true;
        while (proceed){
            try {
                int a = arr[end];
                int check = findAns(arr, start, end);
                if (arr[check] > arr[ans] && start <= end) {
                    ans = check;
                }
                else if (start > end) {
                    proceed = false;
                }
                int newStart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newStart;
            }
            catch (Exception e){
                end = end - 1;
            }
        }
        return ans;
    }
    static int findAns(int [] arr, int start, int end){
        int ans = start;
        for (int i = start; i <= end; i++){
            if (arr[i] < arr[i + 1])
                ans = i;
        }
        return ans;
    }
}