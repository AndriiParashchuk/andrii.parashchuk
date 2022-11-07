package com.java.class18;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divisor = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisor++;
            }
        }
        if (divisor == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}
//-----------------Second approach---------------------
//
//      for (int i = 2; i < num; i++) {
//          if (num % i == 0) {
//              divisor++;
//           }
//         }
//          if (divisor == 0) {
//               System.out.println("Prime");
//         } else {
//                System.out.println("Not Prime");
//         }