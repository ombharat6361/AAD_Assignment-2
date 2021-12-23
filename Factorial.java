package com.company;

import java.util.Scanner; //for taking user input

public class Main {

    public static void main(String[] args) {
        //The factorial of a number is the product of the number and each preceeding number down to but not including 0.
        System.out.println("Enter number to find the factorial of:");
        Scanner num = new Scanner(System.in);
        long n = num.nextLong();
        long Fac=1;
        //looping to find factorial by extracting digits
        while(n>0)
        {
            Fac=Fac*n;
            n--;
        }
        System.out.println(Fac);
    }
}
