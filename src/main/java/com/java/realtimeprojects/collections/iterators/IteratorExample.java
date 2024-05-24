package com.java.realtimeprojects.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        //Traversal using for-each loop
        for(Integer number : numbers) {
            System.out.println(number);
        }

        //Traversal using Iterator
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("Traversing list using Iterator");

        while(iterator.hasNext()) {
            int currentNumber = iterator.next();

            if(currentNumber == 30) {
                iterator.remove();
            }
        }
        System.out.println(numbers);

        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        System.out.println(numbers);




    }
}
