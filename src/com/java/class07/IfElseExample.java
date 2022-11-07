package com.java.class07;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number ");
        int a = in.nextInt();


        System.out.println("Input second number ");
        int b = in.nextInt();

        if (a>b){
            System.out.println("Greater number is "+a);
        }else
            System.out.println("Greater number is "+b);

    }
}
