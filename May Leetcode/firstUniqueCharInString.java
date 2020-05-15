//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        boolean flag = false;
        Character c = 'a';
        for (Character i : map.keySet()) {
            if (map.get(i) == 1) {
                flag = true;
                c = i;
                break;
            } else {
                flag = false;
            }
        }

        if (flag) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    return i;
                }
            }
        }

        return -1;
    }
}
