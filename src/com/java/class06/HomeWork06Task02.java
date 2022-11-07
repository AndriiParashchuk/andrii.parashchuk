package com.java.class06;

import java.util.Scanner;

public class HomeWork06Task02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Principle");

        int principle = sc.nextInt();
        System.out.println("Please enter the Interest rate");

        float rate = sc.nextFloat();

        System.out.println("Please enter number of Years");
        int year = sc.nextInt();

        float simple_rate = (principle * rate * year)/100;

        System.out.println("Simple interest rate is "+ simple_rate);


    }
}
