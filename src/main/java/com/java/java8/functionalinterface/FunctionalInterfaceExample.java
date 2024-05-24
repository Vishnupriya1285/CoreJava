package com.java.java8.functionalinterface;

import java.util.function.Function;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Function<String,Integer> convertFunction=(String str)->{
            int length=0;
            if(str!=null && str.length()!=0)
                length=str.length();
            return length;
        };
        int length=convertFunction.apply("Vishnu");
        System.out.println("The length of the given String is :: "+length);

        Function<Integer,String> intToStringConvert=(Integer num)->{
            String str=String.valueOf(num);
            return str;
        };
        String convertedStr=intToStringConvert.apply(100);
        System.out.println(convertedStr);
        //To know whether the given Integer is converted into String or not
        System.out.println(convertedStr instanceof String);
    }
}
