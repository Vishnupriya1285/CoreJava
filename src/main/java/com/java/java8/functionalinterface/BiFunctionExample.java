package com.java.java8.functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunc=(num1,num2)->num1+num2;
        int sum= biFunc.apply(12,15);
        System.out.println("Sum : "+sum);

        //Taking Strings and returns int
        BiFunction<String,String,Integer> biFuncStr=(str1,str2)->str1.length()+str2.length();
        System.out.println("The sum of the length of two strings is : "+biFuncStr.apply("Vishnu","Priya"));
    }
}
