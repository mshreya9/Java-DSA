class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int i = 0, j = 0, maxCount = Integer.MIN_VALUE;
        while(j < s.length()){
            //calculation
            if(isVowel(s.charAt(j))){
                count++;
            }
            
            // if window size is less than k
            if(j-i+1 < k){
                j++;
            }
            
            // at window size
            else if(j-i+1 == k){
                maxCount = Math.max(maxCount, count);
                
                //removing the calculation for i
                if(isVowel(s.charAt(i))){
                    count--;
                }
                
                //slide the window
                i++;
                j++;
            }
        }
        
        return maxCount;
    }
    
    public boolean isVowel(Character ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}