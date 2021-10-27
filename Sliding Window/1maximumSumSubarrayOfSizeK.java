class maximumSumSubarrayOfSizeK {
    public static void main(String args[]) {
        int[] arr = {2,5,1,8,2,9,1};
        int n = 7;
        int k = 3;

        int sum = 0, maxi = Integer.MIN_VALUE;
        int i = 0, j = 0;

        while(j < n){
            sum = sum + arr[j];
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                maxi = Math.max(maxi, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        System.out.println(maxi);
    }
}

//Output: 19