package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter number: ");
	    Scanner num=new Scanner(System.in);
        long n = num.nextLong();
        long r,sum=0,temp=n;
        //first loop for extracting digits
        while(n>0)
        {
            long Fac=1;
            r=n%10;
            //second loop for finding factorial of extracted digits
            while(r>0)
            {
                Fac=Fac*r;
                r--;
            }
            sum=sum+Fac;
            n=n/10;
        }
        //Condition to check. 145 is a Peterson number
        if(sum==temp)
        {
            System.out.println(temp+" is a Peterson number");
        }
        else
        {
            System.out.println(temp+" is not a Peterson number");
        }
    }
}
