//magic no. is a no. which is power of 5 or sum of powers (unique) of 5.
//For eg. 5 (yes), 10 (5 to the power of 1 + 5 to the power of 1) (no), 30 (5 to the power of 1 + 5 to the power of 2) (yes)

class Solution {
    public static void main(String[] args) {
        int i = 5; //5th magical number 

        int pow = 1;
        int ans = 0;
        while(i != 0){
            pow = pow * 5;
            if((i & 1) != 0){
                ans = ans + pow;
            }

            i = (i >> 1);
        }

        System.out.println(ans);
    }
}

//Output
//130