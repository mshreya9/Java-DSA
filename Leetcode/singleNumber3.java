class Solution {
    public int[] singleNumber(int[] nums) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        
        int k = 0;
        for(Integer i : map.keySet()){
            if(map.get(i) == 1){
                arr[k++] = i;
            }
        }
        return arr;
    }
}