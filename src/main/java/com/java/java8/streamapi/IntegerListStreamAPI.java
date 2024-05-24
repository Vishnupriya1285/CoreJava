package com.java.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerListStreamAPI {
    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(1,2,2,3,4,6,6,8,10);
        Stream<Integer> intStream=intList.stream();

        List<Integer> newIntList=intStream.map(n -> n * 2).filter(n->n>3).collect(Collectors.toList());
        System.out.println(newIntList);
    }
}
