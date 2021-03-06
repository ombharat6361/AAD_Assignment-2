package com.company;
import java.util.Scanner; //for taking user input
public class Main {

    public static void main(String[] args)
    {
        //A Palindrome number is a number which, when reversed, is equal to the original number
        System.out.println("Enter number: ");
        Scanner num=new Scanner(System.in);
        long n = num.nextLong(); //using long to initialize to factor in larger numbers
        long temp=n,r,sum=0;
        //looping to extract digits and reverse the number
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        //condition to check if the new reverse number is equal to the initial number
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
