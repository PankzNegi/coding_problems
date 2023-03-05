package com.pankz;

import java.util.Arrays;

public class SubArrayAverageSizeK {
    public static void main(String[] args) {
        double[] result = findAverage(new int[]{2, 3, 4, 5, 7, 9, 12, 15, 20, 30}, 5);
        System.out.println(Arrays.toString(result));

    }


    public static double[] findAverage(int[] arr, int k) {
        double[] result = new double[arr.length - k + 1];
        int windowStart = 0;
        double windowSum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                result[windowStart] = windowSum / k;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }
}
