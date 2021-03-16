public class EditDistanceVirtuallyBreak {
    public static int EDRecursionVidx(String s1, String s2, int vidx1, int vidx2){
        //Base Case
        if(s1.length() == vidx1 || s2.length() == vidx2){
            return Math.max(s1.length()-vidx1, s2.length()-vidx2);
        }

        char ch1 = s1.charAt(vidx1);
        char ch2 = s2.charAt(vidx2);
        int ans = 0;
        if(ch1 == ch2){
            ans = EDRecursionVidx(s1, s2, vidx1+1, vidx2+1);
        }
        else{
            int i = EDRecursionVidx(s1, s2, vidx1+1, vidx2);
            int d = EDRecursionVidx(s1, s2, vidx1, vidx2+1);
            int r = EDRecursionVidx(s1, s2, vidx1+1, vidx2+1);

            ans = Math.min(i, Math.min(d,r)) + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.err.println(EDRecursionVidx("abcd", "agcfd", 0, 0));
    }
}

//Output: 2
//TC: O(3 to the power m+n)
