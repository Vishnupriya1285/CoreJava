package com.java.arrays;

public class RightTrianglenumberPattern {
    public static void main(String[] args) {
        int rows=7;
        for(int i=0;i<rows;i++)
        {
            for(int k=rows;k>1;k--)
                System.out.print(" ");
            for(int j=0;j<i;j++)
            {
                    System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
