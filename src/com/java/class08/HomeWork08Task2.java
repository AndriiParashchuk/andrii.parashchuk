package com.java.class08;

import java.util.Scanner;

public class HomeWork08Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter total amount:");
        int total = in.nextInt();

        if (total >= 10000){
            System.out.println("Bill after discount: " + (int)(total - (total * 0.2)));
        } else if (total>= 5000) {
            System.out.println("Bill after discount: " + (int)(total - (total * 0.15)));

        } else if (total >= 2000) {
            System.out.println("Bill after discount: " + (int)(total - (total * 0.1)));

        } else if (total >= 1000) {
            System.out.println("Bill after discount: " + (int)(total - (total * 0.05)));

        } else if (total < 1000 && total == 0) {
            System.out.println("Bill after discount: " + total);

        } else {
            System.out.println("ERROR . . . " + " Please input positive amount");

        }

    }
}
