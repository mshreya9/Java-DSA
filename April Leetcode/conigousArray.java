//Question
//Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer, Integer> countMapping = new HashMap<>();
        int count = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){ 
                count--;
            }
            else{
                count++;
            }
            
            if(count == 0){
                maxLen = i + 1;
            } 
            else if(countMapping.containsKey(count)){
                int len = i - countMapping.get(count);
                if(len > maxLen) 
                    maxLen = len;
            } 
            else{
                countMapping.put(count, i);
            }
        }
        return maxLen;
    }
}