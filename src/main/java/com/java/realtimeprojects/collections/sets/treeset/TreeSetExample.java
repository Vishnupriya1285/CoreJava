package com.java.realtimeprojects.collections.sets.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Comparator<String> strDescComparator=(n1,n2)->n2.compareTo(n1);
        TreeSet<String> strTreeSet=new TreeSet<>(strDescComparator);
        strTreeSet.add("A");
        strTreeSet.add("B");
        strTreeSet.add("Z");
        strTreeSet.add("D");
        strTreeSet.add("t");
        strTreeSet.add("E");
        strTreeSet.add("S");
        strTreeSet.add("null");

        System.out.println(strTreeSet);

        TreeSet<Character> charTreeSet=new TreeSet<>();
        charTreeSet.add('z');
        charTreeSet.add('d');
        charTreeSet.add('a');
        charTreeSet.add('c');
        charTreeSet.add('f');
        charTreeSet.add('F');
        charTreeSet.add('A');

        System.out.println(charTreeSet);

        Comparator<Integer> descComparator=(n1,n2)->n2.compareTo(n1);
        Set<Integer> intTreeSet=new TreeSet<>(descComparator);
        intTreeSet.add(50);
        intTreeSet.add(20);
        intTreeSet.add(10);
        intTreeSet.add(-40);
        intTreeSet.add(70);
        intTreeSet.add(30);
        intTreeSet.add(60);

        System.out.println(intTreeSet);
    }
}
