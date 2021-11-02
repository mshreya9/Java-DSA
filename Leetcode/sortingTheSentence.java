class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] ans = new String[9];
        for(int i = 0; i < arr.length; i++){
            char c = arr[i].charAt(arr[i].length()-1);
            int n = Character.getNumericValue(c);
            ans[n-1] = arr[i].substring(0, arr[i].length()-1);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 9; i++){
            if(ans[i] != null){
                sb.append(ans[i]);
                sb.append(" ");
            }
        }
        
        return sb.toString().trim();
    }
}