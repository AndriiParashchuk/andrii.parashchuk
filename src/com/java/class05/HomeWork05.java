package com.java.class05;

import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter Hello");
        String w1 = scan.next();

        System.out.println("Please enter World");
        String w2 = scan.next();

        String w3 = w1;
        w1 = w2;
        w2 = w3;

        System.out.println(w1);
        System.out.println(w2);



    }
}
