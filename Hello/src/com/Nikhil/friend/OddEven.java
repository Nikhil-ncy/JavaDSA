package com.Nikhil.friend;
import java.util.Scanner;
public class OddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num%2==0)
            System.out.println("Your number is an even number");
        else
            System.out.println("Your number is an odd number");
    }
}
