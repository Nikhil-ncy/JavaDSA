package com.Nikhil.friend;
import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int c = n;
        int f = 1;
        while(c>0)
        {
            f=f*c;
            c--;
        }
        System.out.println("Fibnocci series upto "+n+" is: "+f);
    }
}
