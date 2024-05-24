package com.java.java8.methodreferences;

import java.util.List;

public class SoutMethodReferences {
    public static void main(String[] args) {
        List<Integer> intList=List.of(1,4,5,6,4,5,9,8,56,33,44);
        //Using Lambda
        intList.forEach(n-> System.out.print(n+" "));
        System.out.println("\n=====================");
        //Using Method reference
        intList.forEach(System.out::print);
    }
}
