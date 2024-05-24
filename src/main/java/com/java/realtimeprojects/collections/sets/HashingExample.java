package com.java.realtimeprojects.collections.sets;
import java.util.Set;
import java.util.HashSet;

public class HashingExample {
    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<>();
        System.out.println();
        hashSet.add("Apple");
        hashSet.add("apple");
        hashSet.add("A");
        System.out.println(hashSet);
    }
}
