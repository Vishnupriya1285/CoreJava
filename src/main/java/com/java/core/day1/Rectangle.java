package com.java.core.day1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double length,width,area,perimeter;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle:");
        length=sc.nextDouble();
        System.out.println("Enter the width of the Rectangle:");
        width=sc.nextDouble();
        area=length*width;
        perimeter=2*(length+width);
        System.out.println("The area of the Rectangle is: "+area);
        System.out.println("The perimeter of the Rectangle is: "+perimeter);
    }
}
