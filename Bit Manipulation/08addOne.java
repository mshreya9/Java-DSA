class Solution {
    public static void main(String[] args) {
        int n = 9;

        int mask = 1;
        while((n & mask) != 0){
            n = n ^ mask;
            mask = (mask << 1);
        }
        n = n ^ mask;
        System.out.println(n);
    }
}

//Output
//10