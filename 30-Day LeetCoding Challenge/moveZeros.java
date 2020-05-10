//Question
// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;
        int k = nums.length-1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                temp[j++] = nums[i];
            }
            else{
                temp[k--] = nums[i];
            }
        }
        System.arraycopy(temp, 0, nums, 0, nums.length); 
    }
}