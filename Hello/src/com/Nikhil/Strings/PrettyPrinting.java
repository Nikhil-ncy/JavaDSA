package com.Nikhil.Strings;
import java.util.Calendar;
import java.util.Formatter;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1672f;
        System.out.printf("Formatted number is %.2f", a);
        // prints number till 2 decimal digits in the same time rounding off also.

        System.out.printf("\nPie: %.3f", Math.PI);
        System.out.printf("\nHello, my name is %s and I am %s.", "Nikhil", "Cool");
    }
}


