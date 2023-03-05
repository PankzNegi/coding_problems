package com.pankz;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int max=MaxSubArray(new int[]{2,3,4,5,6,7,8,9},3);
        System.out.println(max);

    }
    public static int MaxSubArray(int[]arr,int k)
    {
        int windowSum;
        int maxSum=0;
        for(int i=0;i<=arr.length-k;i++)
        {
            windowSum=0;
            for(int j=i;j<i+k;j++)
            {
                windowSum+=arr[j];
            }
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}
