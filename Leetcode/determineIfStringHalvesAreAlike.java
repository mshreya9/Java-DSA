//A LITTLE SHORTER VERSION
class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String s1 = s.substring(0, n/2);
        String s2 = s.substring(n/2, n);
        int v = 0;
        
        Set<Character> set = new HashSet<>();
	    for(char c : "aeiouAEIOU".toCharArray()){
		    set.add(c);
        }
        for(int i = 0; i < n/2; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(set.contains(ch1)){
                v++;
            }
            if(set.contains(ch2)){
                v--;
            }
        }
        if(v == 0){
            return true;
        }
        return false; 
    }
}

//ALTERNATIVE

class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String s1 = s.substring(0, n/2);
        String s2 = s.substring(n/2, n);
        int v = 0;
        for(int i = 0; i < n/2; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U'){
                v++;
            }
            if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' || ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U'){
                v--;
            }
        }
        if(v == 0){
            return true;
        }
        return false;
    }
}