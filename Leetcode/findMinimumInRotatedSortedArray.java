class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0, end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            int next = (mid+1) % n;
            int prev = (mid+n-1) % n;

            if(nums[mid] <= nums[next] && nums[mid] <= nums[prev]){
                return nums[mid];
            }

            else if(nums[mid] <= nums[end]){
                end = mid - 1;
            }
            else if(nums[start] <= nums[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}