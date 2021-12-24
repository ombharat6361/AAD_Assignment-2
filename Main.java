package com.company;

import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str=str.toLowerCase(Locale.ROOT);
        String ns="";
        for(int i=str.length()-1;i>=0;i--)
        {
            ns=ns+str.charAt(i);
        }
        System.out.println(ns);
    }
}
