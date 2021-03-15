public class LCSVirtuallyBreak {
    public static int LCSRecursionVidx(String s1, String s2, int vidx1, int vidx2){
        if(s1.length() == vidx1 || s2.length() == vidx2){
            return 0;
        }

        char ch1 = s1.charAt(vidx1);
        char ch2 = s2.charAt(vidx2);

        int ans = 0;

        if(ch1 == ch2){
            ans = LCSRecursionVidx(s1, s2, vidx1+1, vidx2+1) + 1;
        }
        else{
            int op1 = LCSRecursionVidx(s1, s2, vidx1, vidx2+1);
            int op2 = LCSRecursionVidx(s1, s2, vidx1+1, vidx2);
            ans = Math.max(op1, op2);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(LCSRecursionVidx("abcd", "agcfd", 0, 0));
    }
}

//Output: 3

//It's better to virtually break the string than using substring function.
//But it's still recursive code with exponential time complexity
//TC: O(2 to the power m+n)