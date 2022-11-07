package com.java.class16;

import java.util.Scanner;

public class HWExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Task1
        System.out.println("\t\t---Task1---");
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of the digits of the number " + number + " is " + sum);
        //Task 2
        System.out.println("\n\t\t---Task2---");
        int i = 10, j = 1;
        int total = 0;
        while (j < i) {
            total += i + j;
            if (i != 10)
                System.out.print(" + " + i + " + " + j);
            else
                System.out.print(i + " + " + j);
            i--;
            j++;
        }
        System.out.println(" = " + total);
        //Task 3
        System.out.println("\n\t\t---Task3---");
        double summ = 0;
        for (int k = 1; k < 11; k++) {
            if (k != 1)
                System.out.print(" + " + k + "/" + (k + 1));
            else
                System.out.print(k + "/" + (k + 1));
            summ += (double) k / (k + 1);
        }
        System.out.printf(" = %.3f", summ);
        //Task 4
        System.out.println("\n\n\t\t---Task4---");
        System.out.println("\n\n\t\t---Task4---");
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int tempnum = num;
        String factors = "";
        System.out.print("The factors of the number " + num + " are ");
        for (int p = 1; p <= num; p++) {
            if (num % p == 0)
                System.out.print(p + " ");
        }

    }
}
