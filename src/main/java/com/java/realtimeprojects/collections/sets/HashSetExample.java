package com.java.realtimeprojects.collections.sets;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        List<String> empIDList=new ArrayList<>();
        empIDList.add("EMP101");
        empIDList.add("EMP103");
        empIDList.add("EMP105");
        empIDList.add("NULL");
        empIDList.add("null");
        empIDList.add(null);

        empIDList.add("EMP103");
        empIDList.add("EMP105");
        empIDList.add("EMP107");
        empIDList.add("EMP109");
        empIDList.add("EMP101");
        empIDList.add("EMP105");

        System.out.println(empIDList);

        //Removes duplicate entries.
        Set<String> empIDSet=new HashSet<>();
        //First method of initializing the HashSet
//        for(String empID:empIDList)
//            empIDSet.add(empID);

        //Second method of initializing the HashSet by passing the entire collection
        empIDSet.addAll(empIDList);
        System.out.println(empIDSet);

        //Third method of initializing the HashSet by passing the collection at the time declaration
        Set<String> empIDSet1=new HashSet<>(empIDList);

        System.out.println(empIDSet1);
        for(String e:empIDSet1)
            System.out.println(e);
        System.out.println("Print the hashset using Iterator::");
        Iterator<String> hashSetIterator=empIDSet1.iterator();
        while(hashSetIterator.hasNext())
            System.out.println(hashSetIterator.next());
    }
}