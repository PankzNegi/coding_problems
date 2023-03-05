package com.pankz;

public class MaxSumSubArrayviaSlidingWindow {
    public static void main(String[] args) {
        int max=MaxSumSubArray(new int[]{2,3,1,4,8,7,9},3);
        System.out.println(max);

    }
public static int MaxSumSubArray(int[]arr,int k)
{
    int windowStart=0;
    int maxSum=0;
    int windowSum=0;
for(int windowEnd=0;windowEnd<arr.length;windowEnd++)
{
    windowSum+=arr[windowEnd];
    if(windowEnd>=k-1)
    {
        maxSum=Math.max(maxSum,windowSum);
        windowSum-=arr[windowStart];
        windowStart++;
    }
}
return maxSum;

}
}
