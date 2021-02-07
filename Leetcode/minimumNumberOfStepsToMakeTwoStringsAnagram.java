class Solution {
    public int minSteps(String s, String t) {
        if(s.length() != t.length()){
            return 0;
        }
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        int sum = 0;
        for(int i = 0; i < 26; i++){
            sum = sum + Math.abs(arr[i]);
        }
        return sum/2;
    }
}