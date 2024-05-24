package com.java.arrays;

public class TriangleNumberPattern {
    public static void main(String[] args) {
        int rows=5;
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < rows; j++)
            {
                if(j<(4-i))
                    System.out.print(" ");
                else
                    System.out.print((i+1)+" ");
            }
            System.out.println();
        }
        for(int i=rows;i>0;i--) {
            for (int j = 1; j <rows; j++) {
                if (j < (6-i))
                    System.out.print(" ");
                else
                    System.out.print(" "+(i-1));
            }
            System.out.println();
        }
    }
}