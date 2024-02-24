package com.Nikhil.Recursion;

public class Fibo {
    public static void main(String[] args) {
        //double ans = fibo(4);
        int ans = fiboFormula(50);
        System.out.println(ans);
        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormula(i));
        }
    }

    static int fiboFormula(int n){
        return (int)(((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n))) / Math.sqrt(5));
    }
    static int fibo(int n){

        // base condition
        if (n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
