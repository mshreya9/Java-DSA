class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        char res = 0;
        
        if(target >= letters[letters.length-1]){
            return letters[0];
        }
        
        while(start <= end){
            int mid = start + (end-start)/2;
            if(letters[mid] == target){
                start = mid+1;
            }
            else if(letters[mid] < target){
                start = mid+1;
            }
            else if(letters[mid] > target){
                res = letters[mid];
                end = mid-1;
            }
        }
        return res;
    }
}