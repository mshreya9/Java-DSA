// Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// You may assume no duplicates in the array.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }
}