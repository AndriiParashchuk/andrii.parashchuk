package com.java.class16;

import java.util.Scanner;

public class HomeWork16Task01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number please: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0){
           int last = num % 10;
            sum = sum + last;
            num = num / 10;
        }
        System.out.println("Sum of each digits from the given number is: " + sum);
    }
}
