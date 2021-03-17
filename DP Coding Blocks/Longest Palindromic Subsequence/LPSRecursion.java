public class LPSRecursion {
    public static int LPSRecursive(String str, int si, int ei){
        //Base Case
        if(si == ei){
            return 1;
        }
        int ans = 0;
        if(str.charAt(si) == str.charAt(ei)){
            ans = LPSRecursive(str, si+1, ei-1) + 2;
        }
        else{
            int op1 = LPSRecursive(str, si+1, ei);
            int op2 = LPSRecursive(str, si, ei-1);
            ans = Math.max(op1, op2);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "acdgca";
        int si = 0;
        int ei = str.length()-1;
        System.out.println(LPSRecursive(str, si, ei)); 
    }
}

//Output: 5