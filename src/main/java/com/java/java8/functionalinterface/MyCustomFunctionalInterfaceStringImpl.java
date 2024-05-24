package com.java.java8.functionalinterface;

public class MyCustomFunctionalInterfaceStringImpl {
    public static void main(String[] args) {
        MyCustomFunctionalInterfaceString strAppend=(String s1, String s2)->s1+s2;
        System.out.println(strAppend.append("aaa","bbb"));
    }
}
