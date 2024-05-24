package com.java.core.day1;

public class DemoMain {
//    public static void main(Integer[] args) {
//        for(int num:args)
//            System.out.println(num);
//    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        main(new Integer[]{10, 20, 30, 80});
    }
    public static void main(Integer[] args) {
        for(int num:args)
            System.out.println(num);
    }
}
