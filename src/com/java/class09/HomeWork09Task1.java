package com.java.class09;

import java.util.Scanner;

public class HomeWork09Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Year");
        int year = in.nextInt();
        int leapyear = 0;
        leapyear = year % 4;

        if (leapyear == 0){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap Year");

        }



    }
}
