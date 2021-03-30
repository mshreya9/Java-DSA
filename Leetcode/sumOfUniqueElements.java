class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        
        int sum = 0;
        for(Integer i : map.keySet()){
            if(map.get(i) == 1){
                sum += i;
            }
        }
        return sum;
    }
}