package com.java.arrays;

public class ArrayMinAndMaxElement {
    public static void main(String[] args) {
        int[] numArray;
        numArray= new int[]{20, 15, 40, 30, 50, 10};
        //Finding Min valu in an array
        int temp=Integer.MAX_VALUE;
        int tempVal=numArray[0];
        for(int i=0;i<numArray.length;i++)
            if(numArray[i]<tempVal)
                tempVal=numArray[i];
        System.out.println("The minimum value element in the arrray is::"+tempVal);

        //Finding Max value in an array
        int temp1=Integer.MIN_VALUE;

        for(int i=0;i<numArray.length;i++)
            if(numArray[i]>temp1)
                temp1=numArray[i];
        System.out.println("The maximum value element in the arrray is::"+temp1);
    }
}
