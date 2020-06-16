// Given a string s and a string t, check if s is subsequence of t.
// A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of 
// the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }
        int index = 0;
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(index)){
                index++;
            }
            
            if(index == s.length()){
                return true;
            }
        }
        return false;
    }
}