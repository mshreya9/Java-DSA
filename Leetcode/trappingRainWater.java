class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n == 0){
            return 0;
        }
        int[] mxl = new int[n];
        int[] mxr = new int[n];
        
        //Creating mxl (maximum in left array of the element) array
        mxl[0] = height[0];
        for(int i = 1; i < n; i++){
            mxl[i] = Math.max(mxl[i-1], height[i]);
        }
        
        //Creating mxr (maximum in right array of the element) array
        mxr[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            mxr[i] = Math.max(mxr[i+1], height[i]);
        }
        
        //Creating water array
        int[] water = new int[n];
        for(int i = 0; i < n; i++){
            water[i] = Math.min(mxl[i], mxr[i]) - height[i];
        }
        
        //Return the sum of the water array
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += water[i];
        }
        return sum;
    }
}