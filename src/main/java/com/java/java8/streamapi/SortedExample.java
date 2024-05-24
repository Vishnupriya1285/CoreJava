package com.java.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<String> strings=List.of("apple","banana","peach","plum","banana","pear","orange","apple","mango");

        //distinct() to get different fruits
        System.out.println(strings.stream().distinct().collect(Collectors.toList()));
        //sorted() to sort the given collection
        System.out.println(strings.stream().sorted().collect(Collectors.toList()));
        //group by fruits and their count
        System.out.println(strings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        System.out.println(strings.stream().collect(Collectors.groupingBy(Function.identity())));
    }
}
