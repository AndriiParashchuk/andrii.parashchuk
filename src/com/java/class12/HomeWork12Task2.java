package com.java.class12;

import java.util.Scanner;

public class HomeWork12Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = in.nextInt();

        getOddOrEven(num);


    }
          static void getOddOrEven(int a){

        if (a % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

    }
}
