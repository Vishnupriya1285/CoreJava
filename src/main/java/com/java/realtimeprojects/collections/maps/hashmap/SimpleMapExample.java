package com.java.realtimeprojects.collections.maps.hashmap;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class SimpleMapExample {

    public static void main(String[] args) {

        Map<String, Integer> fruitStoreMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Queue<String> queue = new ArrayDeque<>();

        fruitStoreMap.put("Apple", 5);
        fruitStoreMap.put("Banana", 10);
        fruitStoreMap.put("Grapes", 15);
        fruitStoreMap.put("Apple", 10);
        fruitStoreMap.put("Apple", 20);

        System.out.println(fruitStoreMap);
    }
}