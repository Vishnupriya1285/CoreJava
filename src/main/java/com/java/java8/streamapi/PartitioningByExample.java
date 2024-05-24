package com.java.java8.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        List<Integer> intList=List.of(1,4,5,6,8,23,87,43,44,34,54,60,2,6);
        Map<Boolean, List<Integer>> evenOddMap = intList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(evenOddMap);
        System.out.println("Even Numbers in the given List : "+evenOddMap.get(true));
        System.out.println("Odd Numbers in the given List : "+evenOddMap.get(false));
    }
}
