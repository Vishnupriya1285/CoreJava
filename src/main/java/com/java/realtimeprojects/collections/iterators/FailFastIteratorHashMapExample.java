package com.java.realtimeprojects.collections.iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastIteratorHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<String,Boolean> hashMap=new HashMap<>();
        hashMap.put("Apple",true);
        hashMap.put("Banana",true);
        hashMap.put("Orange",true);
        hashMap.put("Grapes",true);

        Runnable runnable = () -> {
            hashMap.put("Guava", false);
            hashMap.remove("Banana");
        };
        new Thread(runnable).start();
        Iterator<Map.Entry<String, Boolean>> iterator = hashMap.entrySet().iterator();
        Thread.sleep(1000);

        while(iterator.hasNext()) {
            String fruit = iterator.next().getKey();
            System.out.println("Fruit:: "+ fruit);
        }
    }
}
