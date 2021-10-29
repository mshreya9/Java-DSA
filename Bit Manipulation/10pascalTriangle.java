class Solution {
    public static void main(String[] args) {
        int n = 6;

        //1. Give the sum of the nth row
        System.out.println((int)Math.pow(2, n-1));
        
        //2. Give the sum of all the elemnts until the nth row
        int res = 1 << n;
        System.out.println(res-1);
    }
}

//Output
// 32
// 63

//Explanation => 
// The Pascal is traingle formed below ->

// 1st row -> 1
// 2nd row -> 1 1
// 3rd row -> 1 2 1
// 4th row -> 1 3 3 1
// 5th row -> 1 4 6 4 1
// 6th row -> 1 5 10 10 5 1

// So, 
// 1. The sum of 6th row is => 32
// 2. Sum of all the elemnts until the 6th row is => 1 + 2 + 4 + 8 + 16 + 32 = 63