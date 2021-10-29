//Given an array of integers, return the indices of the two numbers whose sum is equal to a given target.

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                ans[0] = map.get(temp);
                ans[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}

//Output
//0 1 