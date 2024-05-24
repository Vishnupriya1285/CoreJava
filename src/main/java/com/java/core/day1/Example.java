package com.java.core.day1;

public class Example {
    public static void main(String[] args) {
        boolean def;
        def = Boolean.parseBoolean(null);
        //System.out.println(def);
        String str="100";
        int n=Integer.parseInt(str);
        //System.out.println(n);
        Integer num1=new Integer(7);
        Integer num2=Integer.valueOf(7);
        System.out.println(num1==num2);
        System.out.println(num1.equals(num2));
    }
}
