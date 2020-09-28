class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int n = A.length;
        int start = 0;
        int end = n-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid > 0 && mid < n-1){
                if(A[mid] > A[mid-1] && A[mid] > A[mid+1]){
                    return mid;
                }
                else if(A[mid-1] > A[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            
            else if(mid == 0){
                if(A[0] > A[1]){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            
            else if(mid == n-1){
                if(A[n-1] > A[n-2]){
                    return n-1;
                }
                else{
                    return n-2;
                }
            }
        }
        return -1;
    }
}