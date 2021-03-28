class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int left = 0, right = n;
        for(int i = 0; i < nums.length; i++){
            if((i & 1) == 0){
                arr[i] = nums[left++];
            }
            else{
                arr[i] = nums[right++];
            }
        }
        return arr;
    }
}