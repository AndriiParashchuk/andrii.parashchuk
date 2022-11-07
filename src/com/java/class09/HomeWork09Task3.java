package com.java.class09;

import java.util.Scanner;

public class HomeWork09Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String word ="Notes";
        int N500, N100, N20, N10, N5, N2, N1;
        N500 = N100 = N20 = N10 = N5 = N2 = N1 = 0;


        System.out.println("Please input total amount");
        int num = in.nextInt();


        if (num > 0){
        N500 = num / 500;
        N100 = (num % 500) / 100;
        N20 = (num % 100) / 20;
        N10 = (num % 20) / 10;
        N5 = (num % 10) / 5;
        N2 = (num % 5) / 2;
        N1 = (num % 2);


        if  (N500 > 0) {
            if (N500 ==1) {
                    word = "Note";
            } else {
                    word = "Notes";
                }
            System.out.println(N500 + " " + word + " of 500");
            }

        if  (N100 > 0) {
            if (N100 ==1) {
                    word = "Note";
            } else {
                    word = "Notes";
                }
            System.out.println(N100 + " " + word + " of 100");
            }
        }if  (N20 > 0) {
            if (N20 ==1) {
                word = "Note";
            } else {
                word = "Notes";
            }
            System.out.println(N20 + " " + word + " of 20");
        }
        if  (N10 > 0) {
            if (N10 == 1) {
                word = "Note";
            } else {
                word = "Notes";
            }
            System.out.println(N10 + " " + word + " of 10");
        }
        if  (N5 > 0) {
            if (N5 == 1) {
                word = "Note";
            } else {
                word = "Notes";
            }
            System.out.println(N5 + " " + word + " of 5");
        }
        if  (N2 > 0) {
            if (N2 ==1) {
                word = "Note";
            } else {
                word = "Notes";
            }
            System.out.println(N2 + " " + word + " of 2");
        }
        if  (N1 > 0) {
            if (N1 ==1) {
                word = "Note";
            } else {
                word = "Notes";
            }
            System.out.println(N1 + " " + word + " of 1");

        }
    }
}





