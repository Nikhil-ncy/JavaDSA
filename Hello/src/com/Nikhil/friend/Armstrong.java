package com.Nikhil.friend;
//print all 3-digit Armstrong number
public class Armstrong
{
    public static void main(String[] args)
    {
        System.out.print("All 3-digit Armstrong numbers are: ");
        for(int i=100; i<=999; i++)
        {
            int d=0;
            int c=i;
            while(c!=0)
            {
                d = d + (int)Math.pow((c % 10), 3);
                c/=10;
            }
            if(i==d)
                System.out.print(i+" ");
        }
    }
}
