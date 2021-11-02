class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxlen = -1;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                maxlen = Math.max(maxlen, i-1-map.get(ch));
            }
            else {
                map.put(ch, i);
            }
        }
        return maxlen;
    }
}