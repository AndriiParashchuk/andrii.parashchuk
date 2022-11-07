package com.java.class11;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");

        int num1 = sc.nextInt();
        System.out.println("Please enter second number");

        int num2 = sc.nextInt();
        System.out.println("Please enter operation");

        String f = sc.next();


        switch (f.toLowerCase()) {

            case "add":
            case "+":
                System.out.println(num1 + num2);
                break;
            case "sub":
            case "-":
                System.out.println(num1 - num2);
                break;
            case "mul":
            case "*":
                System.out.println(num1 * num2);
                break;
            case "div":
            case "/":
                System.out.println(num1 / num2);
                break;
            case "mod":
            case "%":
                System.out.println(num1 % num2);
                break;

            default:
                System.out.println("Please choose right operator");
        }

    }
}
