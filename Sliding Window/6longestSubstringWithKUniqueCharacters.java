import java.util.*;

class longestSubstringWithKUniqueCharacters {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;

        //initialisations
        int i = 0, j = 0, maxLen = -1;
        Map<Character, Integer> map = new HashMap<>();

        while(j < s.length()){
            // add string characters to map
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else{
                map.put(ch, 1);
            }

            // increment j until we reach k unique chars
            if(map.size() < k){
                j++;
            }

            // when we reach k unique chars
            else if(map.size() == k){
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            }

            // when we exceed k unique chars, remove from index i until k condition is
            // satisfied
            else if(map.size() > k){
                while(map.size() > k){
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

//Output: 7 ("cbebebe")