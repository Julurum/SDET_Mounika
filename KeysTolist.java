package com.devlabs.assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeysTolist {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Custardapple");
        map.put(20, "orange");
        map.put(30, "pineapple");
        map.put(40, "Strawbeery");
        map.put(50, "Kiwi");

        System.out.println("\n1. Export Map Key to List...");
        
        List<Integer> result = new ArrayList(map.keySet());
        
        result.forEach(System.out::println);

        System.out.println("\n2. Export Map Value to List...");
        
        List<String> result2 = new ArrayList(map.values());
        
        result2.forEach(System.out::println);

    }

}
