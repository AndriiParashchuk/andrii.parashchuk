package com.java.class06;

import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your age ");
         int numY = scan.nextInt();
         int numM = numY * 12;
         int numD = numM * 30;
         int numMins = numD * 24 * 60;

        System.out.println("You have spent " + numM + " month on earth ");
        System.out.println("You have spent " + numD +" days on earth ");
        System.out.println("You have spent " + numMins+ " mins on earth ");



    }
}
