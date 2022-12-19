package com.java.practice.exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }finally {
            scanner.close();
        }
    }
}
