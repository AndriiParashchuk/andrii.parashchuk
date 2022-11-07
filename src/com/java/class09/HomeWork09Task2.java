package com.java.class09;

import java.util.Scanner;

public class HomeWork09Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input power consumed in units");
        int unit = input.nextInt();
        double total = 0.0;

        if (unit >= 0 && unit <= 200) {
            total = unit * 0.5;
        } else if (unit >200 && unit <= 400) {
            total = unit * 0.65 + 100;
        } else if (unit > 400 && unit <= 600) {
            total = unit * 0.8 + 230;
        }else {
            total = unit * 0.8 + 230;
        }
        System.out.println("Rs." +total + " paid by the customer");


    }
}
