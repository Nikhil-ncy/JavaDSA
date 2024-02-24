package com.Nikhil.Strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        getSubSeq("", "abc");

//        System.out.println(getNum("", "abc"));
        // this number also takes care of empty substring

        System.out.println(getSubSeqList("", "abc"));
    }
    static void getSubSeq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        // take the character
        getSubSeq(p + ch, up.substring(1));
        //ignore the character
        getSubSeq(p, up.substring(1));
    }
    static int getNum(String p, String up){
        if (up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        return getNum(p + ch, up.substring(1)) + getNum(p, up.substring(1));
    }

    static ArrayList getSubSeqList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = getSubSeqList(p + ch, up.substring(1));
        ArrayList<String> right = getSubSeqList(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
