public class EditDistanceRecursion {
    public static int EDRecursion(String s1, String s2){
        //Base Case
        if(s1.length() == 0 || s2.length() == 0){
            return Math.max(s1.length(), s2.length());
        }

        char ch1 = s1.charAt(0);
        char ch2 = s2.charAt(0);

        String ros1 = s1.substring(1);
        String ros2 = s2.substring(1);

        int ans = 0;

        if(ch1 == ch2){
            ans = EDRecursion(ros1, ros2);
        }
        else{
            int i = EDRecursion(ros1, s2);
            int d = EDRecursion(s1, ros2);
            int r = EDRecursion(ros1, ros2);

            ans = Math.min(i, Math.min(d,r)) + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(EDRecursion("abcd", "agcfd")); 
    }
}

//Output: 2