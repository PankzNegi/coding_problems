package com.pankz;
//Given an array of positive numbers and a positive number ‘S’,
// find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
public class MinimumsizeSubArraySum {
    public static void main(String[] args) {
       int minLength= findMinSizeSubArray(new int[]{2,1,5,2,3,2},7);
        System.out.println("length of smallest subarray"+minLength);


    }
    public  static  int findMinSizeSubArray(int[]arr,int s)
    {
        int windowStart=0;
        int windowSum=0;
        int minLength=Integer.MAX_VALUE;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++)
        {
            windowSum+=arr[windowEnd];
            while(windowSum>=s){
            minLength=Math.min(minLength,windowEnd-windowStart+1);
            windowSum-=arr[windowStart];
            windowStart++;


            }
        }
        return  minLength==Integer.MAX_VALUE?0:minLength;
    }
}
