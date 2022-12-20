package com.java.class42;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPracticalExample {
    public static void main(String[] args) {
        List<String> listOfData = new ArrayList<>();

        listOfData.add("Banana");
        listOfData.add("Apple");
        listOfData.add("Potato");
        listOfData.add("Tomato");
        listOfData.add("Banana");
        listOfData.add("Apple");
        listOfData.add("Orange");
        listOfData.add("Cucumber");
        listOfData.add("Mango");
        listOfData.add("Tomato");
        listOfData.add("Apple");
        listOfData.add("Banana");

        Set<String> duplicateItems = new HashSet<>();
        Set<String> uniqueItem = new HashSet<>();

        for (String item : listOfData) {
            if (!uniqueItem.add(item)) {
                duplicateItems.add(item);
            }
        }

        System.out.println("Duplicate items - " + duplicateItems);

    }
}
