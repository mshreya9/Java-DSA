public class KOrderedLCSRecursion {
    public static int KOrderedLCSRecursive(String s1, String s2, int k, int vidx1, int vidx2){
        //Base Case
        if(s1.length() == vidx1 || s2.length() == vidx2){
            return 0;
        }

        int ans = 0;
        if(s1.charAt(vidx1) == s2.charAt(vidx2)){
            ans = KOrderedLCSRecursive(s1, s2, k, vidx1+1, vidx2+1) + 1;
        }
        else{
            int op1 = KOrderedLCSRecursive(s1, s2, k, vidx1, vidx2+1);
            int op2 = KOrderedLCSRecursive(s1, s2, k, vidx1+1, vidx2);
            int op3 = 0;
            if(k >= 1){
                op3 = KOrderedLCSRecursive(s1, s2, k-1, vidx1+1, vidx2+1) + 1;
            }

            ans = Math.max(op1, Math.max(op2, op3));
        }

        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "agcfd";
        int k = 1;
        System.out.println(KOrderedLCSRecursive(s1, s2, k, 0, 0));
    }
}

//Output: 4