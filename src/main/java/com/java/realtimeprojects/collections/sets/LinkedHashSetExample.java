package com.java.realtimeprojects.collections.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> strLinkedSet=new LinkedHashSet<>();
        strLinkedSet.add("Apple");
        strLinkedSet.add("null");
        strLinkedSet.add("Banana");
        strLinkedSet.add("Mango");
        strLinkedSet.add("null");//HashSet and LinkedHashSet allows one null(String) value.
        strLinkedSet.add(null);//HashSet and LinkedHashSet allows one null value.
        strLinkedSet.add(null);//HashSet and LinkedHashSet allows one null value.
        strLinkedSet.add("null");//only one null(String) will be there so the previous null is replaced by this.
        strLinkedSet.add("Pear");
        strLinkedSet.add("Mango");// Only one mango will be there as duplicates not allowed

        System.out.println(strLinkedSet);
    }
}
