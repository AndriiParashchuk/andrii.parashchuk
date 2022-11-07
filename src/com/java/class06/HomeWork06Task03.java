package com.java.class06;

import java.util.Scanner;

public class HomeWork06Task03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please inter Total bill amount");
        float t = sc.nextFloat();

        System.out.println("Please inter Discount percentage amount");
        float d = sc.nextFloat();

        float f = t * d /100;

        System.out.println("Final bill amount after discount is " + (t-f));



    }
}
