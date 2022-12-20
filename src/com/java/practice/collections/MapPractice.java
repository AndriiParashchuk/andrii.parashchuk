package com.java.practice.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, String> countryCurrencyData = new HashMap<>();

        countryCurrencyData.put("Austria", "Euro");
        countryCurrencyData.put("India", "Rupee");
        countryCurrencyData.put("Dubai", "Durham");
        countryCurrencyData.put("Qatar", "Riyal");
        countryCurrencyData.put("United Kingdom", "Pound");
        countryCurrencyData.put("Turkey", "Lira");

//        System.out.println(countryCurrencyData.get("India"));
//        System.out.println(countryCurrencyData.size());
//        System.out.println(countryCurrencyData.containsKey("Japan"));
//        System.out.println(countryCurrencyData.containsValue("Euro"));

        Collection<String> values = countryCurrencyData.values();
        for (String str : values) {
            System.out.println(str);
        }

        System.out.println("=================All Key Value=================");
        Set<String> keys = countryCurrencyData.keySet();
        for (String key : keys){
            System.out.println(key+" = "+countryCurrencyData.get(key));
        }

        System.out.println("++++++++++++++All Key Value+++++++++++++++++++");
        Set<Map.Entry<String,String>>pairs = countryCurrencyData.entrySet();
        for (Map.Entry<String,String> pair : pairs){
            System.out.println(pair.getKey()+ " = "+ pair.getValue());
        }

    }
}
