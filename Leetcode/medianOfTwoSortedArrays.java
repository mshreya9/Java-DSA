class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = mergeTwoSortedArrays(nums1, nums2);
        if(ans.length % 2 != 0){
            return (double)ans[ans.length/2];
        }
        else{
            int mid = (ans.length-1)/2;
            return (double)(ans[mid]+ans[mid+1])/2;
        }
    }
    
    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length+arr2.length];
        int i = 0, j = 0, k = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merged[k] = arr1[i];
                k++;
                i++;
            }
            else{
                merged[k] = arr2[j];
                k++;
                j++; 
            }
        }
        
        if(i == arr1.length){
            while(j < arr2.length){
                merged[k] = arr2[j];
                k++;
                j++; 
            }
        }
        
        if(j == arr2.length){
            while(i < arr1.length){
                merged[k] = arr1[i];
                k++;
                i++; 
            }
        }
        return merged;
    }

}