class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i = 0, j = 0, ans = 0, sum = 0;
        Set<Integer> set = new HashSet<>();
        
        while(j < nums.length) {
            if(!set.contains(nums[j])) {
                sum += nums[j];
                set.add(nums[j]);
                ans = Math.max(ans, sum);
                j++;
            }
            else {
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
        }
        
        return ans;
    }
}