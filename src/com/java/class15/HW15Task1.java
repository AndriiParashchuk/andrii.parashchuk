package com.java.class15;

public class HW15Task1 {
    public static void main(String[] args) {

        int result = 0;
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0)
                //System.out.println(i);
                result = result + i;
            i++;
        }
        System.out.println(result);

    }
}
