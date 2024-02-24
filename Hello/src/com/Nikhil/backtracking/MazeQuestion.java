package com.Nikhil.backtracking;
import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.*;

public class MazeQuestion {
    public static void main(String[] args) {
        System.out.println(count(4, 5));

//        ArrayList<String> ans = getPath("", 4, 5);
//        System.out.println(ans);
//        System.out.println(ans.size());
//        for(String n: ans){
//            if (n.startsWith("DDRR") || n.startsWith("RRDD")){
//                System.out.println(n);
//            }
//        }
        System.out.println(goDiagonal("", 3, 3));
    }
    static int count(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    static ArrayList<String> getPath(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1){
            list.addAll(goDiagonal(p + "V", r - 1, c));
        }
        if (c > 1){
            list.addAll(goDiagonal(p + "H", r, c - 1));
        }

        return list;
    }

    static ArrayList<String> goDiagonal(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1){
            list.addAll(goDiagonal(p + "D", r - 1, c - 1));
        }

        if (r > 1){
            list.addAll(goDiagonal(p + "V", r - 1, c));
        }
        if (c > 1){
            list.addAll(goDiagonal(p + "H", r, c - 1));
        }

        return list;
    }
}
