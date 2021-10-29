class Solution {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;

        int j = 1;
        j = 1 << (i-1);
        n = n & j;

        if(n > 0){
            System.out.println("ith bit is a set bit");
        } else {
            System.out.println("ith bit is NOT a set bit");
        }
    }
}

//Output

//ith bit is a set bit