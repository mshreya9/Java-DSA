import java.util.*;

class longestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";

        int i = 0, j = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(j < s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
            
            if(map.size() == j-i+1){
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }
            
            else if(map.size() < j-i+1){
                while(map.size() < j-i+1){
                    char ch1 = s.charAt(i);
                    map.put(ch1, map.get(ch1) - 1);
                    
                    if(map.get(ch1) == 0){
                        map.remove(ch1);
                    } 
                    
                    i++;
                }
                j++;
            }
        }
        
        System.out.println(maxLen);
    }
}

//Output: 3 (wke)