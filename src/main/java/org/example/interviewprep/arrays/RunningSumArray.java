package org.example.interviewprep.arrays;

import java.util.Arrays;

public class RunningSumArray {
    public static void main(String[] args) {
        //int[] nums={1,2,3,4};
        int[] nums={1,1,1,1};
        System.out.println("The given array is : "+ Arrays.toString(nums));
        System.out.println("The running sum of given Array numbers is : "+Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
                nums[i]=nums[i];
            else
               nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
