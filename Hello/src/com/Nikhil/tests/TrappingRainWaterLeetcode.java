package com.Nikhil.tests;

// https://leetcode.com/problems/trapping-rain-water/?envType=study-plan-v2&envId=top-interview-150
public class TrappingRainWaterLeetcode {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int len = height.length;
        if(len <= 2){
            // atleast 3 sides are needed for containing water.
            return 0;
        }

        int count = 0;
        int i = 0;
        while(i < len){
            int num = height[i];

            if(i == 0 && num == 0){
                // there is no left boundary to contain water
                i++;
                continue;
            }
            int nextBig;

            if(num == 0){
                nextBig = findNextStrictBig(height, i);
            }
            else{
                nextBig = findNextBig(height, i);
            }
            if(nextBig == -1){
                // now we can't get the water as there is no out boundary on right side for containing water
                i++;
            }

            else{
                count += countWater(i, nextBig, height);
                i = nextBig;
            }
        }

        return count;
    }

    static int findNextBig(int[] height, int index){
        for(int i = index + 1; i < height.length; i++){
            if(height[i] >= height[index]){
                return i;
            }
        }
        return -1;
    }

    static int countWater(int start, int end, int[] height){
        int count = 0;
        if(height[start] == 0 && start != 0){
            for(int i = start + 1; i < end; i++){
                count += height[end] - height[i];
            }
        }

        for(int i = start + 1; i < end; i++){
            count += height[start] - height[i];
        }
        return count;
    }

    static int findNextStrictBig(int[] height, int index){
        for(int i = index; i < height.length; i++){
            if(height[i] > height[index]){
                return i;
            }
        }
        return -1;
    }
}
