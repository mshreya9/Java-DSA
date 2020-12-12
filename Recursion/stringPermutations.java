import java.util.*;

public class stringPermutations {
    public static ArrayList<String> getPermutations(String str){
        //Base Case
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char ch = str.charAt(0);
        String restOfString = str.substring(1);
        ArrayList<String> recResult = getPermutations(restOfString);
        ArrayList<String> myResult = new ArrayList<>();
        for(String recResultString : recResult){
            for(int i = 0; i <= recResultString.length(); i++){
                String val = recResultString.substring(0,i) + ch + recResultString.substring(i);
                myResult.add(val);
            }
        }
        return myResult;
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(getPermutations(str));
    }
}

//Output
//[abc, bac, bca, acb, cab, cba]