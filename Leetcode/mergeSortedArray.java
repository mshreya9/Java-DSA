class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m+n];
        int i = 0, j = 0, k = 0;
        
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                merged[k] = nums1[i];
                k++;
                i++;
            }
            else{
                merged[k] = nums2[j];
                k++;
                j++; 
            }
        }
        
        if(i == m){
            while(j < n){
                merged[k] = nums2[j];
                k++;
                j++; 
            }
        }
        
        if(j == n){
            while(i < m){
                merged[k] = nums1[i];
                k++;
                i++; 
            }
        }
        
        for(int z = 0; z < m+n; z++){
            nums1[z] = merged[z];
        }
    }
}