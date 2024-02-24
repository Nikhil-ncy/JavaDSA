package com.Nikhil.Strings;

import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        builder.insert(4, "*****####******");
        builder.insert(6, Arrays.toString(new int[]{2, 4, 6, 7}));
        System.out.println(builder.toString());

        String name = "Nikhil Chandra Yadav";
        System.out.println(Arrays.toString(name.concat(" is awesome.").split(" ")));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
