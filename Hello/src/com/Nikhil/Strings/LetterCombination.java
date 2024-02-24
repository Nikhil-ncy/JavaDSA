package com.Nikhil.Strings;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {
        System.out.println(findCombination("", "45"));
    }

    static List<String> findCombination(String p, String up){
        if (up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();

        int val = Character.getNumericValue(ch);

        for (int i = 3 * (val - 1); i < 3 * val; i++) {
            char c = (char) ('a' + i);
            ans.addAll(findCombination(p + c, up.substring(1)));
        }
        return ans;
    }
    static List<String> findCombinationLeetcode(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();

        int val = Character.getNumericValue(ch);
//        int val = ch - '0';
        int l = 3 * (val - 2);
        int u = 3 * (val - 1);
        if(val == 7){
            u = u + 1;
        }
        else if(val == 8){
            l = l + 1;
            u = l + 3;
        }
        else if(val == 9){
            l = l + 1;
            u = l + 4;
        }

        for (int i = l; i < u; i++) {
            char c = (char) ('a' + i);
            ans.addAll(findCombinationLeetcode(p + c, up.substring(1)));
        }
        return ans;
    }
}
