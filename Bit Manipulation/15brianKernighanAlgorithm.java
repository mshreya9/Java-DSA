class Solution {
    public static void main(String args[]){
        int n = 9;
        
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        System.out.println(count);
    }
}

//Output
//2

// n =  9 -> 1001 -> has 2 set bits