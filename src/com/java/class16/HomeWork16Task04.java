package com.java.class16;

import java.util.Scanner;

public class HomeWork16Task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = in.nextInt();
        System.out.print("Factors of " + num + " are: " );
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
