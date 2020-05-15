//Question
//Write an algorithm to determine if a number n is "happy".
// A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
// Return True if n is a happy number, and False if not.

import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        int sqr = 0;
        HashSet<Integer> set = new HashSet<Integer>();        
        while(set.add(n)){
            sqr = 0;
            while(n > 0){
                int last = n%10; 
                sqr = sqr + last*last;
                n = n/10;
            }
            if(sqr == 1){
                return true;
            } else {
               n = sqr; 
            }
        }
        return false; 
    }
} 
