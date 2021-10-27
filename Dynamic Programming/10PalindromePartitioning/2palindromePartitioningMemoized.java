class Solution{
    public static int solve(String s, int i, int j){
        int[][] t = new int[1001][1001];
        for(int p = 0; p < 1001; p++){
            for(int q = 0; q < 1001; q++){
                t[p][q] = -1;
            }
        }

        if(i >= j){
            return 0;
        }

        if(isPalindrome(s, i, j)){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for(int k = i; k <= j-1; k++){
            int temp = 1 + solve(s, i, k) + solve(s, k+1, j);
            if(temp < min){
                min = temp;
            }
        }
        t[i][j] = min;
        return t[i][j];
    }

    public static boolean isPalindrome(String s, int i, int j){
        if(i >= j){
            return true;
        }
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "nitik";
        int n = s.length();
        System.out.println(solve(s, 0, n-1));
    }
}

// String "nitik" will have 2 palindrome partitions -> n | iti | k

//Output: 2