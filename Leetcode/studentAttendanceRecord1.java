class Solution {
    public boolean checkRecord(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                count++;
            }
            
            if(i >= 2 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') {
                return false;
            }
        }
        if(count > 1){
            return false;
        }
       return true;
    }
}