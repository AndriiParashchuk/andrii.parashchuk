package com.java.class07;

import java.util.Scanner;

public class HomeWork0701 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a number please");
        int a = in.nextInt();

        if (a>0){
            System.out.println("Number is positive");
        } else if (a<0) {
            System.out.println("Number is negative");
        } else if (a==0) {
            System.out.println("Number is zero");

        }


    }
}
