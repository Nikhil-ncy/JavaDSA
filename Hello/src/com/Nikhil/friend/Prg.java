package com.Nikhil.friend;
import java.util.*;

public class Prg {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int n = 0, pe = 0, po = 0;
        while (num!=0)
        {
           if(num<0)
               n+=num;
           else if(num%2==0)
               pe+=num;
           else
               po+=num;
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        }
        System.out.println("Sum of entered negative numbers are: "+n);
        System.out.println("Sum of entered positive even numbers are: "+pe);
        System.out.println("Sum of entered positive odd numbers are: "+po);
        }
    }
