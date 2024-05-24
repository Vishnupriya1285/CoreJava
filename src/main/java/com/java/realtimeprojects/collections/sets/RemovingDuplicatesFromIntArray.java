package com.java.realtimeprojects.collections.sets;

import java.lang.reflect.Array;
import java.util.*;

public class RemovingDuplicatesFromIntArray {
    public static void main(String[] args) {
        int[] intArr={1,4,6,17,8,9,15,4,2,2,3,1,8};

        System.out.println("The Integer Array is::"+Arrays.toString(intArr));
        //Removes duplicate entries (Accepts single NULL value)
        Set<Integer> intHashSet=new HashSet<>();
        for(int element:intArr)
            intHashSet.add(element);
        System.out.println("After removing duplicates using HashSet ::"+intHashSet);

        //Removes duplicates and remembers insertion order (Accepts single NULL value)
        Set<Integer> intLinkedSet=new LinkedHashSet<>();
        for(int element:intArr)
            intLinkedSet.add(element);
        System.out.println("After removing duplicates using LinkedHashSet ::"+intLinkedSet);

        //Removes duplicates , remembers insertion order and maintains sorting order.(Accepts no NULL values)
        Set<Integer> intTreeSet=new TreeSet<>();
        for(int element:intArr)
            intTreeSet.add(element);
        System.out.println("After removing duplicates using TreeSet ::"+intTreeSet);
    }
}
