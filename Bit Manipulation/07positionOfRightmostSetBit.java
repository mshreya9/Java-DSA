class Solution {
    public static void main(String[] args) {
        int n = 54;

        int pos = 1;
        int mask = 1;
        while((n & mask) == 0){
            pos++;
            mask = mask << 1;
        }

        System.out.println(pos);
    }
}

//Output
//2

//Explanation => 0110110 (54) -> getting the rightmost set bit -> is at position 2