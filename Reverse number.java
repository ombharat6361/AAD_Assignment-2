package com.company;
import java.util.Scanner; //for taking user input
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter number: ");
        Scanner num=new Scanner(System.in);
        long n = num.nextLong();//using long to factor in larger numbers
        long temp=n,r,sum=0;
        //looping to extract digits and reverse the number
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
