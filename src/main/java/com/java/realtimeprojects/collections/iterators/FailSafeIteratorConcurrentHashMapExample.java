package com.java.realtimeprojects.collections.iterators;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteratorConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<String,Boolean> conHashMap=new ConcurrentHashMap<>();
        conHashMap.put("Apple",true);
        conHashMap.put("Banana",true);
        conHashMap.put("Orange",true);
        conHashMap.put("Grapes",true);
        conHashMap.put("Peach",false);

        Iterator<Map.Entry<String,Boolean>> iterator=conHashMap.entrySet().iterator();
        Runnable runnable=()->{
            conHashMap.put("Strawberry",false);
            Boolean istrue=conHashMap.remove("Peach");
            System.out.println("Thread name is :: "+Thread.currentThread().getName());
            System.out.println("The Fruits are :: "+conHashMap);
        };
        new Thread(runnable,"Second Thread").start();
        //Thread.sleep(1000);

        while(iterator.hasNext())
        {
            //System.out.println("Thread name :: "+Thread.currentThread().getName());
            System.out.println("Fruit name is :: "+iterator.next());
        }

    }
}
