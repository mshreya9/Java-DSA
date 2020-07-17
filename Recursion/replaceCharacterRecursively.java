//Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.

import java.util.*;
class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
        if(input.length() == 0){
            return input;
        }
        String ans = "";
        if(input.charAt(0) == c1){
            ans = ans + c2;
        } else{
            ans = ans + input.charAt(0);
        }
        
        String small = replaceCharacter(input.substring(1), c1, c2);
        
        return ans + small ;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        System.out.println(replaceCharacter(input, c1, c2));
    }
}