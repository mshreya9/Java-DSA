class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            boolean val = isIsomorphic(words[i], pattern);
            if(val == true){
                list.add(words[i]);
            }
        }
        return list;
    }
    
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        
        if(s.length() != t.length()){
            return false;
        }
        
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!map1.containsKey(c1)){
                if(map2.containsKey(c2)){
                    return false;
                }
                else{
                    map1.put(c1,c2);
                    map2.put(c2,c1);
                }
            }
            else{
                char mappedChar = map1.get(c1);
                if(mappedChar != c2){
                    return false;
                }
            }
        }
        return true;
    }
}