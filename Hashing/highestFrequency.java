//Find the number in the array which occurs the most number of times (highest frequency)

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int n = 12;
		int[] arr = {1,3,2,2,3,1,2,4,7,4,2,4};
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i], 1);
			}
		}
		int ans = 0;
		int max = Integer.MIN_VALUE;
		for(Integer i : map.keySet()){
			if(map.get(i) > max){
				max = map.get(i);
				ans = i;
			}
		}
		System.out.println(ans);
    }
}

//Output
//2