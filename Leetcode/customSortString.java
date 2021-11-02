class Solution {
    public String customSortString(String order, String str) {
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i) - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(char ch : order.toCharArray()){
            int val = count[ch - 'a'];
            while(val-- > 0){
                sb.append(ch);
            }
            count[ch - 'a'] = 0;
        }

        //add remaining characters
        for(int i = 0; i < 26; i++){
            int val = count[i];
            while(val-- > 0){
                sb.append((char)(i+'a'));
            }
        }
        
        return sb.toString();
    }
}