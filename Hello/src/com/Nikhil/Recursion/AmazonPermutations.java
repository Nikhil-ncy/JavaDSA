package com.Nikhil.Recursion;

import java.util.*;

public class AmazonPermutations {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(permute(new ArrayList<>(), nums));
    }
    static List<List<Integer>> permute(List<Integer> p, List<Integer> nums){
        if(nums.size() == 0){
            List<List<Integer>> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.size(); i++){
            int val = nums.get(i);

//            ans.addAll(permute(new ArrayList<>().add(p.size(), val)));
        }
        return ans;
    }
}
