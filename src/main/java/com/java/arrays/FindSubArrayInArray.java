package com.java.arrays;

import java.util.Arrays;

public class FindSubArrayInArray {
    public static void main(String[] args) {
        int[] numArray={20, 15, 40, 30, 50, 10,60,45};
        int[] subArray={15,50,30};
        //Finding subarray or not
           //First sort the given original array
           //Then search if the elements in the sub array are in the given array
           //if all the elements i nthe sub array are avaialable in the given array then it is the subarray of the given array.

        Arrays.sort(numArray);
        boolean isTrue=false;
        for(int i=0;i<numArray.length;i++)
            for(int j=0;j<subArray.length;j++)
                if(subArray[j]==numArray[i])
                    isTrue=true;
        if(isTrue==true)
            System.out.println("The second array is the subarray of the first array!");
    }
}
