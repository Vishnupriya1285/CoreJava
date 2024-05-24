package com.java.java8.methodreferences;

import java.util.Arrays;

public class CustomClassStaticMethodReference {
    public static void main(String[] args) {
        String [] array = {"cat", "banana", "apple", "kiwi","338888888867858578585855785785785"};

        //Comparing Strings by length

        //Using Lambda Way
        Arrays.sort(array,(s1,s2)->StringUtility.compareStringByLength(s1,s2));
        System.out.println("Sorted Array using Lambda : "+Arrays.toString(array));

        //Using Method Reference
        Arrays.sort(array,StringUtility::compareStringByLength);
        System.out.println("Sorted Array using Method reference : "+Arrays.toString(array));

        //Comparing Strings by value

        //Using Lambda
        Arrays.sort(array,(s1,s2)->StringUtility.compareStringByValue(s1,s2));
        System.out.println("Sorted Array using Lambda : "+Arrays.toString(array));

        //Using Method reference
        Arrays.sort(array,StringUtility::compareStringByValue);
        System.out.println("Sorted Array using Method reference : "+Arrays.toString(array));

        //Lambda Uppercase
        Arrays.asList(array).forEach(s->StringUtility.toUpperCase(s));

        //Method reference
        Arrays.asList(array).forEach(StringUtility::toUpperCase);



    }
}
class StringUtility
{
    public static int compareStringByLength(String str1,String str2)
    {
        return Integer.compare(str1.length(),str2.length());
    }
    public static int compareStringByValue(String str1,String str2)
    {
        return str1.compareTo(str2);
    }
    public static void toUpperCase(String str)
    {
        System.out.println(str.toUpperCase());
    }
}
