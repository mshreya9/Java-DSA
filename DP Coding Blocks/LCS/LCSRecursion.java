public class LCSRecursion {
    public static int LCSRec(String s1, String s2){
        if(s1.length() == 0 || s2.length() == 0){
            return 0;
        }

        char ch1 = s1.charAt(0);
        char ch2 = s2.charAt(0);

        String ros1 = s1.substring(1);
        String ros2 = s2.substring(1);

        int ans = 0;
        
        if(ch1 == ch2){
            ans = LCSRec(ros1, ros2) + 1;
        } else{
            int op1 = LCSRec(s1, ros2);
            int op2 = LCSRec(ros1, s2);
            ans = Math.max(op1, op2);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(LCSRec("abcd", "agcfd"));
    }
}

//Output: 3