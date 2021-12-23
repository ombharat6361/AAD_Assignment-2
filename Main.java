package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter number: ");
        Scanner num=new Scanner(System.in);
        long n = num.nextLong();
        long temp=n,r,sum=0;

        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a Palindrome number");
        }
    }
}
