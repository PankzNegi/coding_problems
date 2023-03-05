package com.pankz;

import java.util.Arrays;

public class SubArrayAverage {
    public static void main(String[] args) {
       double []result= findAverage(new int[]{2,3,4,5,7,9,12,15,20,30},5);
        System.out.println(Arrays.toString(result));


    }

    public static double[] findAverage(int[] arr, int k) {
        double[] result = new double[arr.length - k + 1];
        for (int i = 0; i <=arr.length - k; i++) {
            double sum = 0;
            for (int j = 0; j < i + k; j++) {
                sum += arr[j];
                result[i] = sum / k;
            }

        }

        return result;
    }

}