package com.company;

import java.util.Scanner;//for user input

public class Main {

    public static void main(String[] args) {
        //program to add two matrices which are 2D arrays
        System.out.println("Enter the number of rows and columns: ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt(); //number of rows
        int b = num.nextInt(); //number of columns
        int ar1[][]=new int[a][b];
        int ar2[][]=new int[a][b];
        int ar3[][]=new int[a][b];
        int flag=1,count=1;
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
            }
            if(flag==0)
                break;
        }
        for(int i=0;i<a;i++) //nested for loop for checking each element
        {
            for(int j=0;j<b;j++)
            {
                if(ar1[i][j]==ar2[i][j]) //checking if elements are equal
                    flag=1; //arbitrary variable in a conditional statement
                            //which will be used to check equality outside the loop
                else
                {
                    flag=0;
                    break; //using break to exit the loop the moment an element of the first array
                }          //does not match the corresponding element of the second array
            }              //doing this makes sure that the loop does not run again and flag remains 0
            if(flag==0)
                break;     //using this to break out of the outer loop when flag == 0
        }

        if(flag==1)
            System.out.println("The two matrices are equal");
        else
            System.out.println("The two matrices are not equal");
    }
}
