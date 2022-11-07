package com.java.class09;

import java.util.Scanner;

public class Task3Example2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter amount: ");
        int amount = sc.nextInt();

        int n100 = amount / 100;
        int n50 = amount % 100 / 50;
        int n20 = amount % 50 / 20;
        int n5 = amount % 20 / 5;
        int n1 = amount % 5;

        if (n100 > 1){
            System.out.println(n100 +" notes of 100");
        } else if (n100 == 1) {
            System.out.println(n100 + " note of 100");
        }
        if (n50 > 0){
            System.out.println(n50 +" note of 50");
        }
        if (n20 > 1){
            System.out.println(n20 +" notes of 20");
        } else if (n20 == 1) {
            System.out.println(n20 +" note of 20");
        }
        if (n5 > 1){
            System.out.println(n5 +" notes of 5");
        } else if (n5 == 1) {
            System.out.println(n5 +" note of 5");
        }
        if (n1 > 1){
            System.out.println(n1 +" notes of 1");
        } else if (n1 == 1) {
            System.out.println(n1 +" note of 1");
        }



    }
}
