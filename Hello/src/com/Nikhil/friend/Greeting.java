package com.Nikhil.friend;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println("Hello "+input.nextLine()+" :)");
    }
}
