class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(Integer i : nums1){
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(Integer i : nums2){
            set2.add(i);
        }
        set1.retainAll(set2);
        
        int [] arr = new int[set1.size()];
        int index = 0;
        for (int s : set1){
            arr[index++] = s;
        }
        return arr;
    }
}