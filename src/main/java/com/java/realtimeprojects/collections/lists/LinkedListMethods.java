package com.java.realtimeprojects.collections.lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList lls=new LinkedList();
        lls.add("Nissan");
        lls.add("Toyota");
        lls.add("Benz");
        lls.add(1,"Tesla");
        lls.set(0,"Audi");
        lls.remove("Toyota");
        lls.add("rr");
        lls.addLast("Nissan");
        lls.add("Tesla");
        lls.addFirst("BMW");
        lls.remove(0);
        System.out.println("The last index of the element in the list is ::"+lls.lastIndexOf("Tesla"));
        System.out.println("The size of the list is::"+lls.size());

        System.out.println(lls);
    }
}
