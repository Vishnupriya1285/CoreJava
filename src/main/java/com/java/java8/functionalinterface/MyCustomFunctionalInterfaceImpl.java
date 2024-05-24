package com.java.java8.functionalinterface;

public class MyCustomFunctionalInterfaceImpl {
    public static void main(String[] args) {


    /*  MyCustomFunctionalInterface functionalInterface = () -> {
            System.out.println("HELLO LAMBDA");
        };*/

        //functionalInterface.myMethod1();

        MyCustomFunctionalInterface funcInterfaceSum = (int num1, int num2) -> num1 + num2;
        System.out.println("The sum of given 2 numbers is ::"+funcInterfaceSum.sum(10,30));
    }
}
