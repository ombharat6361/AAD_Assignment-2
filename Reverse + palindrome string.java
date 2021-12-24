package com.company;

import java.util.Locale;//for the toLowerCase() function
import java.util.Scanner;//for user input
public class Main {

    public static void main(String[] args) {
        //program that reverses a string
        System.out.println("Enter the string: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str=str.toLowerCase(Locale.ROOT); //coverting all letters to lowercase
        String ns=""; //new string which will store the reversed string
        for(int i=str.length()-1;i>=0;i--)
        {
            ns=ns+str.charAt(i);
        }
        System.out.println("Reversed string: "+ns);
        if(ns.equals(str)) //equals() to compare strings and see if the new string matches the original string
            System.out.println("\n"+str+" is a palindrome");
        else
            System.out.println("\n"+str+" is not a palindrome");
    }
}
