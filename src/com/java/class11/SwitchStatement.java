package com.java.class11;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
         int num = sc.nextInt();

         switch (num){

             case 1:
                 System.out.println("Jan");
                 System.out.println("31");
                 break;
             case 2:
                 System.out.println("Feb");
                 System.out.println("28");
                 break;
             case 3:
                 System.out.println("Mar");
                 System.out.println("31");
                 break;
             case 4:
                 System.out.println("Apr");
                 System.out.println("30");
                 break;
             case 5:
                 System.out.println("May");
                 System.out.println("31");
                 break;
             case 6:
                 System.out.println("Jun");
                 System.out.println("30");
                 break;
             case 7:
                 System.out.println("Jul");
                 System.out.println("31");
                 break;
             case 8:
                 System.out.println("Aud");
                 System.out.println("31");
                 break;
             case 9:
                 System.out.println("Sep");
                 System.out.println("30");
                 break;
             case 10:
                 System.out.println("Oct");
                 System.out.println("31");
                 break;
             case 11:
                 System.out.println("Nov");
                 System.out.println("30");
                 break;
             case 12:
                 System.out.println("Dec");
                 System.out.println("31");
                 break;
             default:
                 System.out.println("Please enter number 1 - 12");


         }

    }
}
