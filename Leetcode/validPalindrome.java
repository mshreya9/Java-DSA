//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

class Solution {
    public boolean isPalindrome(String s) {
        String temp = s.toLowerCase(); 
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
			if (temp.charAt(i) <= 'z' && temp.charAt(i) >= 'a' || temp.charAt(i) >= '0' && temp.charAt(i) <= '9') {
				sb.append(temp.charAt(i));
			}
		}
        
        String str = sb.toString();
        String reverse = sb.reverse().toString();
        if (str.equals(reverse)) {
			return true;
		} else {
			return false;
		}
    }
}