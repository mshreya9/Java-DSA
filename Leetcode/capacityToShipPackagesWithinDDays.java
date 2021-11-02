class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0; //max in weights
        int end = 0; //sum of all elements in weights
        int n = weights.length;
        for(int i = 0; i < n; i++){
            start = Math.max(start, weights[i]);
            end += weights[i];
        }

        int res = -1;
        if(n < days){
            return -1;
        }

        while(start <= end){
            int mid = start + (end-start)/2;
            if(isValid(weights,n,days,mid)){
                res = mid;
                end = mid-1;
            } else{
                start = mid+1;
            }
        }

        return res;
    }
    
    private static boolean isValid(int[] arr, int n, int k, int mid){
        int days = 1;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum > mid){
                days++;
                sum = arr[i];
            }

            if(days > k){
                return false;
            }
        }
        return true;
    }
}