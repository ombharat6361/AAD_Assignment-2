package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter how long you want the Fibonacci series to be: ");
        Scanner num= new Scanner(System.in);
        int n = num.nextInt();
	    int t1=0,t2=1, Fsum=1,e;
        System.out.println(t1);
        System.out.println(Fsum);
        for(int i=2;i<n;i++)
        {
            Fsum=t2+t1;
            System.out.println(Fsum);
            t1=t2;
            t2=Fsum;
        }
    }
}
