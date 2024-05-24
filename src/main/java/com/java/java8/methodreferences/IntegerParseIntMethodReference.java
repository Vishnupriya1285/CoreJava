package com.java.java8.methodreferences;

import java.util.List;

public class IntegerParseIntMethodReference {
    public static void main(String[] args) {
        List<String> intAsString= List.of("1","2","3","4","5");
        //Using Lambda
        System.out.println("Using Lambda : "+intAsString.stream().map(str->Integer.parseInt(str)).toList());

        //Using Method Reference
        System.out.println("Using Method Reference : "+intAsString.stream().map(Integer::parseInt).toList());
    }
}
