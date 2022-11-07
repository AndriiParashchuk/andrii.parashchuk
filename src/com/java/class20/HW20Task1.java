package com.java.class20;
//Write a program to take the full name from the user and print the first letter of the first name and last name

import java.util.Scanner;

public class HW20Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name!");
        String name = sc.nextLine();

       // if (!name.isEmpty()){
            int i = name.indexOf(" ");
            char f = name.charAt(0);
            char s = name.charAt(i + 1);
                System.out.println(f + "." + s);

        //}else {
           // System.out.println("Error!");
       // }

    }
}
