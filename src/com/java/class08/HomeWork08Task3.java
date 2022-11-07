package com.java.class08;

import java.util.Scanner;

public class HomeWork08Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter company rating (1 - 5): ");
        int rating = in.nextInt();

        if (rating == 5) {
            System.out.println("Very Good");

        } else if (rating == 4) {
            System.out.println("Good");

        } else if (rating == 3) {
            System.out.println("Average");

        } else if (rating == 2){
            System.out.println("Poor");

        } else if (rating == 1) {
            System.out.println("Very Poor");

        } else {
            System.out.println("Error");
        }

    }
}
