package com.java.class42;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> setOfData = new HashSet<>();

        setOfData.add(10);
        setOfData.add(50);
        setOfData.add(20);
        setOfData.add(45);

        System.out.println(setOfData);
        for (int num : setOfData){
            System.out.println(num);
        }

    }
}
