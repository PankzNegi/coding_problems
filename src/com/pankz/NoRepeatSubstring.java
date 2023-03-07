package com.pankz;
//Given a string, find the length of the longest substring which has no repeating characters.
import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {
    public static void main(String[] args) {
        int length=findLength("aabcbadcb");
        System.out.println(length);

    }

    public  static int findLength(String str)
    {
        int windowStart=0;
        int maxLength=0;
        Map<Character,Integer> charIndexmap=new HashMap<>();
        for(int windowEnd=0;windowEnd<str.length();windowEnd++)
        {
            char rightChar=str.charAt(windowEnd);
            if(charIndexmap.containsKey(rightChar))
            {
                windowStart=Math.max(windowStart,charIndexmap.get(rightChar)+1);
            }
            charIndexmap.put(rightChar,windowEnd);
            maxLength=Math.max(maxLength,windowEnd-windowStart+1);
        }
        return  maxLength;

    }
}
