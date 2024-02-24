package com.Nikhil.friend;
import java.util.Arrays;
public class VarArgs {
    public static void main (String[] args) {
        fun(2, 3, 4, 5, 67, 69, 89, 45);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
