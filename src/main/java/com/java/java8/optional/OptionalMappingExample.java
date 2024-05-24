package com.java.java8.optional;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class OptionalMappingExample {
    public static void main(String[] args) {
        Optional<String> stringOptional=Optional.ofNullable("Hello");
        Optional<String> updatedStr=stringOptional.map(s->s+" World!!");
        System.out.println("Original String :"+stringOptional);
        System.out.println("Updated String : "+ updatedStr);

        Optional<String> updatedStr1=stringOptional.map(s->s=null);
        updatedStr1.ifPresent(s-> System.out.println("Updated Mapped String : "+ s));
    }
}
