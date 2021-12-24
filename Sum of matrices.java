package com.company;

import java.util.Scanner;//for user input

public class Main {

    public static void main(String[] args) {
	    //program to add two matrices which are 2D arrays
        System.out.println("Enter the number of rows: ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt(); //number of rows
	System.out.println("Enter the number of columns: ");
        int b = num.nextInt(); //number of columns
        int ar1[][]=new int[a][b];
        int ar2[][]=new int[a][b];
        int ar3[][]=new int[a][b];
        System.out.println("Enter the elements of the first matrix: ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                ar1[i][j]=num.nextInt(); //creating first matrix
            }
        }
        System.out.println("Enter the elements of the second matrix: ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                ar2[i][j]=num.nextInt(); //creating second matrix
                ar3[i][j]=ar1[i][j]+ar2[i][j]; //adding matrices
            }
        }
        System.out.println("Sum of matrices: ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(ar3[i][j]+" "); //printing sum matrix
            }
            System.out.println();
        }
    }
}
