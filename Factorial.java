package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number to find the factorial of:");
        Scanner num = new Scanner(System.in);
        long n = num.nextLong();
        long Fac=1;
        while(n>0)
        {
            Fac=Fac*n;
            n--;
        }
        System.out.println(Fac);
    }
}