class Solution {
    public String replaceDigits(String s) {
        char[] ans = s.toCharArray();
        for(int i = 1; i < s.length(); i += 2){
            ans[i] = (char)(ans[i-1] + ans[i] - '0');
        }
        return String.valueOf(ans);
    }
}