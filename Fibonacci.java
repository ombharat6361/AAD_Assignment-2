package com.company;
import java.util.Scanner; //for taking user input
public class Main {

    public static void main(String[] args) {
	//The Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones
        System.out.println("Enter how long you want the Fibonacci series to be: ");
        Scanner num= new Scanner(System.in);
        int n = num.nextInt();
	int t1=0,t2=1, Fsum=1,e;
        System.out.println(t1);
        System.out.println(Fsum);
        for(int i=2;i<n;i++) //looping for the series
        {
            Fsum=t2+t1;
            System.out.println(Fsum);
            t1=t2;     //storing old value of t2 in t1 to add in the next loop
            t2=Fsum;   //Similarly, storing old value of Fsum (newest value) in t2 to add in the next loop
        }
    }
}
