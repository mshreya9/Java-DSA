import java.util.*;

class Solution {

	public static boolean isStringPalindrome(String input) {
        return check(input, 0, input.length() - 1);
	}
    
    public static boolean check(String s, int start, int end){
        if(start >= end){
            return true;
        }
        
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        
        return check(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(isStringPalindrome(input));
    }
}
