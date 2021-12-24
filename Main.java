package com.company;

import java.util.Scanner; //for user input
import java.lang.Character; //for all character related functions like isLowerCase() and toUpperCase()
public class Main {

    public static void main(String[] args) {
        //program that changes uppercase letters to lowercase and vice versa in a string
        System.out.println("Enter the string: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char ch;
        String ns=""; //new string which will store the updated string
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(Character.isUpperCase(ch)) //checking if character is uppercase
            {
                ch=Character.toLowerCase(ch);//converting that character to lowercase
                ns+=ch;//concatenating with updated string
            }
            else if(Character.isLowerCase(ch)) //checking if character is lowercase
            {
                ch=Character.toUpperCase(ch); //converting that character to uppercase
                ns+=ch;
            }
            else                              //for all other characters like digits and special characters
                ns+=ch;                       //concatenating without change
        }
        System.out.println(ns);
    }
}
