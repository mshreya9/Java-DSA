// This question is exactly same as 'Sliding Window Maximum' Problem 239 on Leetcode

import java.util.*;

public class maximumOfAllSubarraysOfSizeK {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

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
        
        //printing output
        for(int r : res){
            System.out.print(r + " ");
        }
    }
}

// Output
// 3 3 5 5 6 7