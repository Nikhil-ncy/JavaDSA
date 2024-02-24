package com.Nikhil.friend;
import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal amount, time and rate");
        int p = input.nextInt();
        int t = input.nextInt();
        int r = input.nextInt();
        System.out.println("Your interest is: "+(p*r*t/100));
    }
}
