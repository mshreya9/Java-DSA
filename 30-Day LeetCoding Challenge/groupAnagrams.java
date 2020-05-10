//Question
//Given an array of strings, group anagrams together.

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<String, List>();
        
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            
            if (!map.containsKey(key)){ 
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}
//["aet"] : ["eat", "tea", "ate"]
//["ant"] : ["tan", "nat"]
//["abt"] : ["bat"]
        