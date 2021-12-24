package com.company;

import java.util.Scanner;//for user input

public class Main {

    public static void main(String[] args) {
        //program to wheck whether a matrix is an identity matrix
        System.out.println("Enter the number of rows: ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt(); //number of rows
        System.out.println("Enter the number of columns: ");
        int b = num.nextInt(); //number of columns
        int ar1[][]=new int[a][b];
        if(a!=b)
        {
            System.out.println("Since the matrix isn't a square matrix, it cannot be identity");
            System.exit(0);
        }
        int flag=1,count=1;
        System.out.println("Enter the elements of the first matrix: ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                ar1[i][j]=num.nextInt(); //creating matrix
            }
        }
        for(int i=0;i<a;i++) //nested for loop for checking each element
        {
            for(int j=0;j<b;j++)
            {
                if(i==j) //checking if elements are equal
                {
                    if (ar1[i][j] == 1)
                        flag = 1; //variable in conditional statement to check whether the matrix is identity

                    else {
                        flag = 0; //when flag is 0, the matrix cannot be identity anymore, so the break statement
                        break;    //breaks out of the loop to prevent further iterations
                    }
                }
                else
                {
                    if(ar1[i][j]==0)
                        flag=1;
                    else
                    {
                        flag=0;
                        break;
                    }

                }
            }
            if(flag==0)
                break;     //using this to break out of the outer loop when flag == 0
        }
        if(flag==1)
            System.out.println("The matrix is an identity matrix");
        else
            System.out.println("The matrix is not an identity matrix");
    }
}
