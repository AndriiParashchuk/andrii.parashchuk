package com.java.class07;

import java.util.Scanner;

public class IfElseExample02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input your age");
        int age = in.nextInt();

        if (age > 15){
            System.out.println("You are eligible for DL");
        }else{
            System.out.println("You are not eligible for DL");

        }

    }
}
