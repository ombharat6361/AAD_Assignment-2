package com.company;

import java.util.Scanner;//for user input
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine(); //string input; nextLine() inputs all characters that are input
        int count=0;//starting counter at 0
        str=str.replaceAll(" ",""); //removing all whitespaces to get accurate results
        for(int i=0;i<str.length();i++)
        {
            count++;
        }
        System.out.println("Number of characters: "+count);
    }
}
