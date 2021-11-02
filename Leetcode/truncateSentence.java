class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            sb.append(words[i]);
            sb.append(" ");
            if(i == k-1){
                break;
            }
        }
        return sb.toString().trim();
    }
}