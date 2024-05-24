package com.java.java8.optional;

import java.util.Optional;

public class OptionalFilterExample {
    public static void main(String[] args) {
        int n=35;
        Optional<Integer> intOptional=Optional.ofNullable(n);
        System.out.println(intOptional);

        Optional<Integer> filteredNum=intOptional.filter(i->(i%2==0));
        System.out.println(filteredNum);

        String name="Vishnu";
        Optional<String> studentName=Optional.ofNullable(name);
        System.out.println(studentName);

        Optional<String> filteredName=studentName.filter(s->s.length()>3);
        System.out.println(filteredName);
    }
}
