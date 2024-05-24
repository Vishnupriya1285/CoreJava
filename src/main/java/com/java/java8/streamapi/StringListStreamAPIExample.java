package com.java.java8.streamapi;

import java.util.List;

public class StringListStreamAPIExample {
    public static void main(String[] args) {
        List<String> strList= List.of("aaa","fff","vvv","bbb","Abc","aabb");
        strList.stream().forEach(s-> System.out.println(s.toUpperCase()));

        long a = strList.stream().filter(s -> s.startsWith("a"))
                .map(s -> s.toUpperCase())
                .map(s -> s.length())
                .count();
        System.out.println("Total number of strings start with 'a' : "+a);
        strList.stream().filter(s -> s.startsWith("a"))
                .map(s -> s.toUpperCase())
                //.map(s -> s.length())
                .forEach(s-> System.out.println("Length : "+s));
    }
}
