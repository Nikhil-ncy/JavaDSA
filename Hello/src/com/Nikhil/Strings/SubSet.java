package com.Nikhil.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {

        int [] arr = {1, 2, 2};
        List<List<Integer>> ans = getSubSetDuplicate(arr);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> getSubSet(int [] arr){

        // this will be the outer list of lists that will contain the final answer
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        // iterate the array
        for(int num: arr){
            int n = outer.size();

            // iterate every list of outer copy it and then add the current num to every list of outer
            for (int i = 0; i < n; i++) {

                // copy the element of ith list of outer
                List<Integer> inner = new ArrayList<>(outer.get(i));

                // add num to the current inner list
                inner.add(num);

                // add this to outer
                outer.add(inner);
            }
        }

        return outer;
    }

    static List<List<Integer>> getSubSetDuplicate(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for(int i = 0; i < arr.length; i++){
            start = 0;
            int n = outer.size();
            // if num = previous num then start = end + 1
            if (i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = outer.size();

            for (int j = start; j < n; j++) {

                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }
}
