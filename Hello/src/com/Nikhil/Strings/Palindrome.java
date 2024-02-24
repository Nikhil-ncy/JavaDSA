package com.Nikhil.Strings;

public class Palindrome {
    public static void main(String[] args) {

        // reversing the string method
//        String revWord = "";
        String word = "abcdcba";
//        for (int i = 0; i < word.length(); i++) {
//            revWord = word.charAt(i) + revWord;
//        }
//        if (word.equals(revWord)){
//            System.out.println("Palindrome word.");
//        }
//        else
//            System.out.println("Not a Palindrome word.");


        // reverse builder method
//        StringBuilder str = new StringBuilder();
//        str.append(word).reverse();
//        if (word.equals(str.toString())){
//            System.out.println("Palindrome word.");
//        }
//        else
//            System.out.println("Not a Palindrome word.");


        // 2 pointer method
        int start = 0, end = word.length() - 1;
        while (start <= end){
            if (word.charAt(start) == word.charAt(end)){
                start++;
                end--;
            }
            else
                break;
        }
        if (start > end){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
}
