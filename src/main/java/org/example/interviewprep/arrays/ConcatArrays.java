package org.example.interviewprep.arrays;

import java.util.Arrays;

public class ConcatArrays {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println("The given array is : "+Arrays.toString(nums));
        System.out.println("The concatenated array is : "+Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int len= nums.length;
        int[] concatNums=new int[len*2];
        for(int i=0;i< nums.length;i++)
            concatNums[i]=nums[i];
        int j=-1;
        for(int i=nums.length;i<concatNums.length;i++) {
            concatNums[i] = nums[j+1];
            j++;
        }
//        int j=0;
//
//        for(int i=0;i< nums.length;i++)
//        {
//            concatNums[j]=nums[i];
//            j++;
//            if((i+1)== nums.length)
//                i=0;
//        }
        return concatNums;
    }
}
