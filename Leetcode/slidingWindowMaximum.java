class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        int i = 0, j = 0;
        Deque<Integer> deque = new LinkedList<>();
        
        while(j < nums.length){
            while(!deque.isEmpty() && (deque.peekLast() < nums[j])){
                deque.pollLast();
            }
            
            deque.add(nums[j]);
            
            if(j-i+1 < k){
                j++;
            }
            
            else if(j-i+1 == k){
                res[i] = deque.peekFirst();
                if(deque.peekFirst() == nums[i]){
                    deque.remove(nums[i]);
                }
                
                //slide
                i++;
                j++;
            }
        }
        
        return res;
    }
}