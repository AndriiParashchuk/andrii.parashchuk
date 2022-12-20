package com.java.class42;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> personAge = new HashMap<>();
        personAge.put("Chirag", 29);
        personAge.put("Kris", 25);
        personAge.put("Kris", 25);
        personAge.put("Krisq", 25);
        personAge.put("Kriss", 25);

        System.out.println(personAge);

    }
}
