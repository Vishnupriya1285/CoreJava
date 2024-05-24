package com.java.java8.methodreferences;

import java.util.function.Consumer;

public class CustomClassInstanceMethodReference {
    public static void main(String[] args) {
        MyClass m1=new MyClass();
        //Before Java 8
        m1.myMethod("Before Java 8");
        //Using Lambda and Consumer Functional Interface's accept() method
        Consumer<String> con1= str-> m1.myMethod(str);
        con1.accept("using Java 8 Lambda");

        //Using Method reference
        Consumer<String> con2=m1::myMethod;
        con1.accept("Using Java 8 Method reference");

    }
}
class MyClass
{
    public void myMethod(String inputStr)
    {
        System.out.println("Input String is : "+inputStr);
    }
}