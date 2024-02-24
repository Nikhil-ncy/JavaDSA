package com.Nikhil.Recursion;

public class ZeroCount {
    public static void main(String[] args) {
        count(30204, 0);
    }
    static void count(int n, int count){
        if (n == 0){
            System.out.println("Number of zeroes = "+count);
            return;
        }
        if (n % 10 == 0){
            count(n / 10, count + 1);
        }
        else{
            count(n / 10, count);
        }
    }
}
