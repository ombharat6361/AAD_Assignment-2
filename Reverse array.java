package com.company;

import java.util.Scanner;//for user input

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter how long you want the array to be: ");
        Scanner num= new Scanner(System.in);
	    int n = num.nextInt();
        int ar[]=new int[n]; //initializing array
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++)//looping to take input in array
        {
            ar[i]=num.nextInt();
        }
        for(int j=ar.length-1;j>=0;j--) //looping to print reverse array
            System.out.println(ar[j]);
    }
}
