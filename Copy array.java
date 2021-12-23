package com.company;

import java.util.Scanner;//for user input

public class Main {

    public static void main(String[] args) {
        //program to copy all elements of one array into another array
        System.out.println("Enter how long you want the array to be: ");
        Scanner num= new Scanner(System.in);
        int n = num.nextInt();
        int ar[]=new int[n]; //initializing array
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++)//looping to take input in array
        {
            ar[i]=num.nextInt();
        }
        int arc[]=new int[n];
        for(int j=0;j<n;j++) //looping to copy elements to new array and printing it
        {
            arc[j]=ar[j];
            System.out.println(arc[j]);
        }
        System.out.println("Your array has been copied to the new array");
    }
}
