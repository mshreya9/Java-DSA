class Solution {
    public static int allocatePages(int[] arr, int k){
        int start = 0; //max in weights
        int end = 0; //sum of all elements in weights
        int n = arr.length;
        for(int i = 0; i < n; i++){
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        int res = -1;
        if(n < k){
            return -1;
        }

        while(start <= end){
            int mid = start + (end-start)/2;
            if(isValid(arr,n,k,mid)){
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
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int k = 2;
        System.out.println(allocatePages(arr, k));
    }
}

//Output: 60