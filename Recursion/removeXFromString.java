import java.util.*;

class Solution {
    public static String removeX(String str){
        if(str.length() == 0){
            return str;
        }

        String ans = "";
        if(str.charAt(0) != 'x'){
            ans = ans + str.charAt(0);
        }

        String smallAns = removeX(str.substring(1)); //index 1 till the end of the string
        return ans + smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(removeX(s));
    }
}