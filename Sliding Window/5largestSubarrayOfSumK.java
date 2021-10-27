class largestSubarrayOfSumK {
    public static void main(String[] args) {
        int[] A = {4,1,1,1,2,3,5};
        int N = 7;
        int K = 5;

        int i = 0, j = 0, sum = 0, maxi = Integer.MIN_VALUE;
        while(j < N){
            sum = sum + A[j];
            if(sum < K){
                j++;
            }
            
            else if(sum == K){
                maxi = Math.max(maxi, j-i+1);
                j++;
            }
            
            else if(sum > K){
                while(sum > K){
                    sum = sum - A[i];
                    i++;
                }
                j++;
            }
        }
        
        System.out.println(maxi);
    }
}

//Output: 4 (1,1,1,2)

//Note: This approach works for only positive integers