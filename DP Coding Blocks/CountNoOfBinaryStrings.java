//Q. Count no of binary strings of length n such that there are no consecutive 1's present inside binary strings.

public class CountNoOfBinaryStrings {
    public static void main(String[] args) {
        int n = 3;
        int[] ones = new int[n];
        int[] zeros = new int[n];

        zeros[0] = 1;
        ones[0] = 1;

        for(int i = 1; i < zeros.length; i++){
            zeros[i] = zeros[i-1] + ones[i-1];
            ones[i] = zeros[i-1];
        }

        int ans = zeros[n-1] + ones[n-1];
        System.out.println(ans);
    }
}

//Output: 5

//How?
// For n = 3: 
// 0 0 0 (yes)
// 0 0 1 (yes)
// 0 1 0 (yes)
// 0 1 1 (no)
// 1 0 0 (yes)
// 1 0 1 (yes)
// 1 1 0 (no)
// 1 1 1 (no)