package com.java.realtimeprojects.collections.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String str = "This is a Simple Sentence to count the Frequency of words . This is just a Simple test .";
        String[] strArr = str.split("\\s+");

        //Before Java 8
        Map<String, Integer> strMap = new HashMap<>();
        for (String s : strArr) {
            if (strMap.containsKey(s)) {
                int count = strMap.get(s);
                count++;
                strMap.put(s, count);
            } else
                strMap.put(s, 1);
        }
        System.out.println(strMap);

        //Using Java 8 method
        Map<String,Integer> strMapJava8=new HashMap<>();
        for(String s:strArr)
            strMapJava8.put(s,strMapJava8.getOrDefault(s,0)+1);
        System.out.println(strMapJava8);
    }
}
