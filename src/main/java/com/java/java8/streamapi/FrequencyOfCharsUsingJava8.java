package com.java.java8.streamapi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfCharsUsingJava8 {
    public static void main(String[] args) {
        //Get the frequency of Each Character in the String using java 8

        String str = "Walmart grocery";
        //Convert String to Character Stream
        //Group the Characters by their Count
        //str.chars()-> introduced in Java 9 and the output of this is integer stream of characters
        //So we're typecasting it to character stream using mapToObj()
        Stream<Character> charStream=str.chars().mapToObj(c->(char)c);
        //The output won't follow the insertion order bcos it uses HasMap
        System.out.println(charStream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        //To maintain the insertion order we've to use LinkedHashMap as below:
        Stream<Character> charStream1=str.chars().mapToObj(c->(char)c);
        LinkedHashMap<Character, Long> groupByCharMap = charStream1
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(groupByCharMap);

        //Sorting the map by Value
        groupByCharMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e-> System.out.println(e));

        System.out.println("==========================");

        //Sorting the map by Key
        groupByCharMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e-> System.out.println(e));
    }
}
