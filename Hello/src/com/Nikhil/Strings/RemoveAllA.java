package com.Nikhil.Strings;

public class RemoveAllA {
    public static void main(String[] args) {
        getAns("", "baccdah");
    }
    static void getAns(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            getAns(p, up.substring(1));
        }
        else{
            getAns(p + ch, up.substring(1));
        }
    }
}
