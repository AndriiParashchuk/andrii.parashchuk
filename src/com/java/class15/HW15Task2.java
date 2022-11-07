package com.java.class15;

public class HW15Task2 {
    public static void main(String[] args) {

        int result = 0;
        int i = 1;
        while (i <= 50) {
            if (i % 3 == 0 || i % 5 == 0)
                //System.out.println(i);
                result = result + i;
            i++;
        }
        System.out.println(result);

    }
}
