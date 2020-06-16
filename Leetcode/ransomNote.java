//Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
//Each letter in the magazine string can only be used once in your ransom note.

class Solution {
    public boolean canConstruct(String r, String m) {
        int[] arr = new int[26];
        for(int i = 0; i < r.length(); i++){
            arr[r.charAt(i) - 'a']++;
        }
        for(int i = 0; i < m.length(); i++){
            if(arr[m.charAt(i) - 'a'] > 0){
                arr[m.charAt(i) - 'a']--;
            }
        }
        for(int i = 0; i < 26; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}