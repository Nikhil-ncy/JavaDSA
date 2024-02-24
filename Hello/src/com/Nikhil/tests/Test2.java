package com.Nikhil.tests;

public class Test2 {
    public static void main(String[] args) {
        // checks if n is a power of 2 or not
        int n = 8;
        System.out.println((n & n-1) == 0);
    }
}
