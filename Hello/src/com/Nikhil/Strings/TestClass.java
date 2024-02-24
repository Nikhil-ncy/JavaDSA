package com.Nikhil.Strings;
class TestClass {
    static int profit = 0;
    public static int maxProfit(int[] prices) {
        difference(prices, 0);
        return profit;
    }
    static void difference(int [] prices, int index){
        if(index == prices.length - 1){
            return;
        }
        for(int i = index + 1; i < prices.length; i++){
            if((prices[i] - prices[index]) > profit){
                profit = prices[i] - prices[index];
            }
        }
        difference(prices, index + 1);
    }

    public static void main(String[] args) {
        int [] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }
}