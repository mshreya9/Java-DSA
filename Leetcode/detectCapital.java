class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 0) return false;
        return allCapitals(word) || allLower(word) || firstCapital(word);
    }
    
    public boolean allCapitals(String word) {
        for(int i = 0; i < word.length(); i++) {
            if(!Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public boolean allLower(String word) {
        for(int i = 0; i < word.length(); i++) {
            if(!Character.isLowerCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public boolean firstCapital(String word) {
        boolean flag = false;
        if(Character.isUpperCase(word.charAt(0))) {
            flag = true;
        }
        for(int i = 1; i < word.length(); i++) {
            if(!Character.isLowerCase(word.charAt(i))) {
                return false;
            }
        }
        if(flag == true) return true;
        return false;
    }
}