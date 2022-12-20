package com.java.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class FIndGreatestNumberFromList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(43);
        numbers.add(65);
        numbers.add(26);
        numbers.add(77);

        int max = numbers.get(0);
        for (int num : numbers){
            if (num > max){
                max = num;
            }
        }
        System.out.println(max);

    }
}
