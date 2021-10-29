class Solution {
    public static void main(String[] args) {
        int n = 21;
        int i = 3;

        int mask = 1;
        mask = ~(1 << (i-1));
        n = n & mask;
        System.out.println(n);
    }
}

//Output
//17

//Explanation => 0010101 (21) -> after resetting the 3rd bit -> 0010001 (17)