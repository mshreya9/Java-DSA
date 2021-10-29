import java.util.*;

class Solution {
    public static void main(String[] args) {
        int n = 7;
		int[] nums1 = {1,2,3,1,2,4,1};
		int[] nums2 = {2,1,3,1,5,2,2};
		ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) != 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
		Collections.sort(list);
        System.out.println(list);
    }
}

//Output
//[1, 1, 2, 2, 3]