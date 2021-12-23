package com.company;
import java.util.Scanner; //for taking user input
public class Main {

    public static void main(String[] args) {
        //Spy number is a number in which the product and the sum of the individual digits are equal
        //Example: 132
        System.out.println("Enter number: ");
        Scanner num = new Scanner(System.in);
        long n = num.nextLong();
        long temp=n,r,sum=0,product=1;
        while(n>0) //looping to extract digits and find sum and product
        {
            r=n%10;
            sum=sum+r;
            product=product*r;
            n=n/10;
        }
        if(sum==product) //condition to check
            System.out.println(temp+" is a spy number");
        else
            System.out.println(temp+" is not a spy number");
    }
}
