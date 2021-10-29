class Solution {
    public static void main(String[] args) {
        int n = 16;

        int res = n & (n-1);
        if(n != 0){
            if(res == 0){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}

//Output
//true