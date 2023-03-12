package com.pankz;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringSameLetterAfterReplacement {
    public static void main(String[] args) {
       int length=findLength("aabccbb",2);
        System.out.println(length);

    }
    public static int findLength(String str,int k)
    {
        int start=0,maxLength=0,maxRepeatCount=0;
        Map<Character,Integer> frequencyMapper=new HashMap<>();
        for (int end=0;end<str.length();end++)
        {
            char rightChar=str.charAt(end);
           frequencyMapper.put(rightChar,frequencyMapper.getOrDefault(rightChar,0)+1);
           maxRepeatCount=Math.max(maxRepeatCount,frequencyMapper.get(rightChar));
           if(end-start+1-maxRepeatCount>k)
           {
               char leftChar=str.charAt(start);
               frequencyMapper.put(leftChar,frequencyMapper.get(leftChar)-1);
               start++;

           }
           maxLength=Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }

}
