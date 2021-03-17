public class PalindromePartitioningRecursion {
    public static int PPRecursion(String s, int si, int ei){
        if(isPalindrome(s,si,ei)){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int k = si; k <= ei-1; k++){
            int fp = PPRecursion(s, si, k);
            int sp = PPRecursion(s, k+1, ei);

            int total = fp+sp+1;
            if(total < min){
                min = total;
            }
        }
        return min;
    }

    public static boolean isPalindrome(String s, int si, int ei){
        int l = si;
        int r = ei;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abacd";
        System.out.println(PPRecursion(s, 0, s.length()-1)); 
    }
}

//Output: 2