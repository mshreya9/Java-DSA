import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(removeDuplicates(input));
    }

    public static String removeDuplicates(String s){
        if(s.length() == 1){
            return s;
        }

        Character c = s.charAt(0);
        String ans = "";
        if(!(c == s.charAt(1))){
            ans = ans + c;
        }

        String smallAns = removeDuplicates(s.substring(1));
        return ans + smallAns;
    }
}