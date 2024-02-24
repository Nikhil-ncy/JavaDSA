package com.Nikhil.friend;
import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int c = n;
        int d = 0;
        while(c>0)
        {
            d=(d*10)+(c%10);
            c/=10;
        }
        if(d==n)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a palindrome number");

    }
}
