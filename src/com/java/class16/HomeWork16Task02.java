package com.java.class16;

public class HomeWork16Task02 {
    public static void main(String[] args) {

        int sumI = 0, sumX = 0;
       for (int i = 10, x = 1; i > x; i--, x++){
          System.out.print(i);
          System.out.print("+");
          System.out.print(x);
          System.out.print("+");
          sumI += i;
          sumX += x;
       }
        System.out.println();
        System.out.println("Result is " + (sumI + sumX));

    }
}
