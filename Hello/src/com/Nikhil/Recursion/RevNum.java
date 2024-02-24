package com.Nikhil.Recursion;

public class RevNum {
    public static void main(String[] args) {
        int num = 13472;
        System.out.println(reverseNum(num));
    }
    // 13472 --> 27431
    static  int reverseNum(int n){
        if (n == 0) {
            return 0;
        }
        int d = (int)Math.log10(n);
        return n % 10 * (int) Math.pow(10, d) + reverseNum(n / 10);
    }
}
