package com.java.class18;

//Factor of 6 - 1, 2, 3, 6,
//

import java.util.Scanner;

public class FindFactorsOfGivenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = sc.nextInt();
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
