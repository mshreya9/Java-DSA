// Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
// Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
// Note: You are not suppose to use the library's sort function for this problem.

class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return;
        }
    
        int start = 0;
        int end = nums.length -1 ;
        int index = 0;
        
        while(index <= end && start < end){
            if(nums[index] == 0){
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
            }
            else if(nums[index] == 2){
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }
            else{
                index++;
            }
        }
    }
}