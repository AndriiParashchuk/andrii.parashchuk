package com.java.class06;

import java.util.Scanner;

public class ConvertAgeYearsToDaysMonthMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age in years");
        int age = sc.nextInt();

        System.out.println("You have spent " + age * 12 + " month");
        System.out.println("You have spent " + age * 12 * 365 + " days");
        System.out.println("You have spent " + age * 12 * 365 * 60 + " mins");


    }
}
