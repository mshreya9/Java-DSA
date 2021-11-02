class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<Character, String>(){{
        put('2', "abc"); put('3', "def"); put('4', "ghi"); put('5', "jkl");
        put('6', "mno"); put('7', "pqrs"); put('8', "tuv"); put('9', "wxyz");
        }};
        
        List<String> list = new ArrayList<>();
        if(digits.equals("")) {
            return list;
        }
        fun(digits, 0, "", map, list);
        return list;
    }

    private void fun(String digits, int idx, String path, Map<Character, String> map, List<String> list) {
        if(digits.length() == path.length()){
            list.add(path);
            return;
        }
        for (int i = idx; i < digits.length(); i++) {
            for (char c: map.get(digits.charAt(i)).toCharArray()) {
                fun(digits, i+1, path+c, map, list);
            }
        } 
    }
}