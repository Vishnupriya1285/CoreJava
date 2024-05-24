package com.java.realtimeprojects.collections.iterators;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> veggiesBasket=new ConcurrentHashMap<>();

        veggiesBasket.put("Cucumber",50);
        veggiesBasket.put("Tomatoes",100);
        veggiesBasket.put("cabbage",20);
        veggiesBasket.put("Potatoes",100);
        veggiesBasket.put("null",10);
        //veggiesBasket.put(null,10);// Gives NullPointerException for ConcurrentHashMap but allows one null for HashMap

        System.out.println(veggiesBasket);

        veggiesBasket.put("Potatoes",veggiesBasket.get("Potatoes")+100);
        System.out.println("Potatoes :: "+veggiesBasket.get("Potatoes"));

        Map<String,Integer> synchronizedMap= Collections.synchronizedMap(new HashMap<>());
        synchronizedMap.put("Cucumber",50);
        synchronizedMap.put("Tomatoes",100);
        synchronizedMap.put("cabbage",20);

        System.out.println(synchronizedMap);

    }
}
