package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int count=0;
        str=str.replaceAll(" ","");
        for(int i=0;i<str.length();i++)
        {
            count++;
        }
        System.out.println("Number of characters: "+count);
    }
}
