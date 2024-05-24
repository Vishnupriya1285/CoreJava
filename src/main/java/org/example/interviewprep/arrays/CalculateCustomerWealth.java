package org.example.interviewprep.arrays;

import java.util.Arrays;

public class CalculateCustomerWealth {
    public static void main(String[] args) {
        int[][] nums={{1,5},
                {7,3},
                {3,5}};
        //int[][] nums={{1,2,3},{3,2,1}};
        System.out.println("The given array of wealth is : "+ Arrays.deepToString(nums));
        System.out.println("The maximum wealth is : "+maxWealth(nums));
    }
    public static int maxWealth(int[][] nums)
    {
//        int maxWealth1=0,maxWealth2=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            for(int j=0;j<nums[i].length;j++) {
//                if(i==0)
//                   maxWealth1 += nums[i][i];
//                else
//                    maxWealth2+=nums[i][j];
//            }
//        }
//        if(maxWealth1>maxWealth2)
//            return maxWealth1;
//        else
//            return maxWealth2;
        int[] sum = new int[10];
        int maxWealth=0;
        int sumVal=0;
        for(int i=0;i<nums.length;i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sumVal += nums[i][j];
            }
            sum[i]=sumVal;
        }
        for(int i=0;i<sum.length;i++)
        {
            if(maxWealth<sum[i])
                maxWealth=sum[i];

        }
         return  maxWealth;
    }
}
