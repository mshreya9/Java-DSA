class Solution {
    public int countPrimeSetBits(int L, int R) {
        int ans = 0;
        for(int i = L; i <= R; i++){
            int count = 0;
            int temp = i;
            while(temp > 0) {
                temp &= (temp - 1);
                count++;
            }
            //check if count is prime
            if(isPrime(count)){
                ans++;
            }
        }
        return ans;
    }
    
    public boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        boolean flag = false;
        for(int i = 2; i <= num / 2; ++i){
            if(num % i == 0){
                flag = true;
                break;
            }
        }

        if(!flag){
            return true;
        }
        return false;
    }
}