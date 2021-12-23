package com.company;

import java.util.Scanner;//for user input

public class Main {

    public static void main(String[] args) {
        //program to print the sum of all array elements and print all even index values
        System.out.println("Enter how long you want the array to be: ");
        Scanner num= new Scanner(System.in);
        int n = num.nextInt();
        int ar[]=new int[n]; //initializing array
        int sum=0;
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++)//looping to take input in array
        {
            ar[i]=num.nextInt();
            sum=sum+ar[i];//adding each element after being entered by the user
        }
        System.out.println("Sum of array elements: "+sum);
        System.out.println("All even index values: ");
        for(int i=0;i<n;i=i+2)
            System.out.println(ar[i]);
    }
}
