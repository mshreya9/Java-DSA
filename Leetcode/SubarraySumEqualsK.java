//Question
//Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.


//Improved Solution
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == k){
                count++;
            }
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            if(map.containsKey(sum))
            {
                map.put(sum, map.get(sum) + 1);
            }
            else{
                map.put(sum, 1);
            }
        }
        
        return count;
    }
    //map.put(sum-k, map.get(sum-k) + 1)
}

//Brute Force Solution
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum = sum + nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}