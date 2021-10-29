//Determine whether a number from q, exist in the array or not.

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int n = 6;
        int[] arr ={12,3,-67,67,34,2};
        int q = 4;
        int[] nums = {4,5,67,7};

        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i], true);
        }

        for(int i = 0; i < q; i++){
            if(map.containsKey(nums[i])){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

/*Output
No
No
Yes
No
*/