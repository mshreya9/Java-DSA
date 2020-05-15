//Question
// Given a non-empty array of integers, every element appears twice except for one. Find that single one.

class Solution {
    public int singleNumber(int[] nums) {
        //using xor 
        int x = nums[0];
        for(int i = 1; i < nums.length; i++){
            x = x ^ nums[i];
        }
        return x;
    }
}