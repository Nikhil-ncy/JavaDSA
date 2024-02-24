package com.Nikhil.tests;

import java.util.*;
public class UberTest {
    public static void main(String[] args) {

        int[] a = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(search(a, 0, a.length-1, 10));
    }
    public static int search(int A[], int l, int h, int key)
    {
        // your code here
        int pivot = -1;
        for(int i = 0; i < A.length-1; i++){
            if(A[i] > A[i+1]){
                pivot = i;
                break;
            }
        }

        int ans = -1;
        if(key == A[l]){
            ans = l;
        }
        else if(key == A[pivot]){
            ans = pivot;
        }
        else if(key > A[l]){
            int s = l, e = pivot;
            while(s <= e){
                int mid = s + (e - s)/2;
                if(key == A[mid]){
                    ans = mid;
                }
                else if(key > A[mid]){
                    s = mid;
                }
                else{
                    e = mid - 1;
                }
            }
        }
        else{
            int s = pivot, e = h;
            while(s <= e){
                int mid = s + (e - s)/2;
                if(key == A[mid]){
                    ans = mid;
                }
                else if(key > A[mid]){
                    s = mid;
                }
                else{
                    e = mid - 1;
                }
            }

        }
        return ans;
    }
}
