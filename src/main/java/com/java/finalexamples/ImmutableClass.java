package com.java.finalexamples;

import org.w3c.dom.ls.LSOutput;

public class ImmutableClass {
    private String name="Vishnu";

    public ImmutableClass()
    {
        System.out.println(name);
        this.name+="priya";
        System.out.println(name);
    }

    public static void main(String[] args) {
        ImmutableClass str=new ImmutableClass();

    }
}
