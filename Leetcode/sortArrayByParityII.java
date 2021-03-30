class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        int idxEven = 0, idxOdd = 1;
        for(int i = 0; i < nums.length; i++){
            if((nums[i] & 1) == 0){
                arr[idxEven] = nums[i];
                idxEven += 2;
            }
            if((nums[i] & 1) != 0){
                arr[idxOdd] = nums[i];
                idxOdd += 2;
            }
        }
        return arr;
    }
}