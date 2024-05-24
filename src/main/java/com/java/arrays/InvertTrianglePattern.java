package com.java.arrays;

public class InvertTrianglePattern {
    public static void main(String[] args) {
        int rows=5;
        for(int i=rows;i>0;i--)
        {
            for(int j=0;j<=rows;j++)
            {
                if(j<(6-i))
                    System.out.print(" ");
                else
                    System.out.print(" "+(j));
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<(rows);j++)
            {
                if(j<(4-i))
                    System.out.print(" ");
                else
                    System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
