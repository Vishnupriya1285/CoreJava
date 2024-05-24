package com.java.java8.java8assignments;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersLambda {
    public static void main(String[] args) {
        List<Integer> intList=List.of(1,2,3,4,5,6,7,84,4,57,65,98);
        List<Integer> evenNumList=intList.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(intList);
        //finding even numbers
        System.out.println("Even numbers from the given List : "+evenNumList);

        //finding odd numbers
        System.out.println("Odd numbers from the given List :"+
                intList.stream()
                        .filter(n->!(n%2==0))
                        .collect(Collectors.toList())
        );

        System.out.println("==================================================");
        //finding the sum of even numbers
        System.out.println("The sum of the even numbers is : "+
                intList.stream()
                        .filter(n->n%2==0)
                        .reduce(0,(a,b)->a+b)
        );
    }
}
