package com.java.class07;

import java.util.Scanner;

public class HomeWork0702 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the order number of the month (1 - 12)");
        int a = in.nextInt();

        if (a == 1){
            System.out.println("31 days");
        } else if (a == 2) {
            System.out.println("28 days");
        } else if (a == 3) {
            System.out.println("31 days");
        } else if (a == 4) {
            System.out.println("30 days");
        } else if (a == 5) {
            System.out.println("31 days");
        } else if (a == 6) {
            System.out.println("30 days");
        } else if (a == 7) {
            System.out.println("31 days");
        } else if (a == 8) {
            System.out.println("31 days");
        } else if (a == 9) {
            System.out.println("30 days");
        } else if (a == 10) {
            System.out.println("31 days");
        } else if (a == 11) {
            System.out.println("30 days");
        } else if (a == 12) {
            System.out.println("31 days");
        }else {
            System.out.println("Error");
        }



    }
}
