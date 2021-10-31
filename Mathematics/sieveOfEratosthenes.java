//Please note: Handwritten notes for this question is uploaded with all the sorting algorithms -> folder Sorting/

import java.util.*;

class Solution {
    public static int countPrimes(int n) {
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

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }
}

//Output
//4 

//Prime nos less than 10 are -> 2,3,5,7 -> 4