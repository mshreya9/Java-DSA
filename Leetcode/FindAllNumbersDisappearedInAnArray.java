class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean[] arr = new boolean[nums.length+1];
        
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]] = true;
        }
        for(int i = 1; i < arr.length; i++){
            if (arr[i] != true) {
                list.add(i);
            }
        }
        //System.out.println(Arrays.toString(arr));
        return list;
    }
}