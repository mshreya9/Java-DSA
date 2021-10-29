class Solution {
    public static void main(String[] args) {
        int n = 21;
        int i = 4;

        int mask = 1;
        mask = 1 << (i-1);
        n = n | mask;
        System.out.println(n);
    }
}

//Output
//29

//Explanation => 010101 (21) -> making 4th bit set -> 011101 (29)