package com.java.arrays;

public class LeftTriangleNumbers {
    public static void main(String[] args) {
        int rows=5;
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < i+1; j++)
                System.out.print(j+1+" ");
            System.out.println();
        }
        System.out.println("----------------------------");
        for(int i=rows;i>0;i--) {
            for (int j = i; j >0; j--)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
