//Sieve of eratosthenes

class Solution {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        int count = 0;
        if(n == 0 || n == 1){
            return 0;
        }
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for(int table = 2; table*table < n; table++){
            if(primes[table] == false){
                continue;
            }
            for(int mult = 2; table*mult < n; mult++){
                primes[table*mult] = false;
            }
        }
        
        for(int i = 0; i < primes.length; i++){
            if(primes[i]){
                count++;
            }
        }
        return count;
    }
}