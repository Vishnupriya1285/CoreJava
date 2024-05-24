package com.java.java8.functionalinterface;

import java.util.function.Predicate;

public class PredicateFunctionalInterfaceExample {
    public static void main(String[] args) {
        Predicate<String> strIsEmpty=(String str)->{
            if(str!=null && !str.isEmpty())
                return false;
            else
                return true;
        };
        Predicate<String> strIsEmpty1=(str)->(str!=null && !str.isEmpty())?false:true;
        System.out.println(strIsEmpty.test("aaa"));
        System.out.println(strIsEmpty.test(null));
        System.out.println(strIsEmpty.test(""));
        System.out.println(strIsEmpty.test(" "));
        System.out.println(strIsEmpty1.test("vvv"));
    }
}
