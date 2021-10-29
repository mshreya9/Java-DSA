class Solution {
    public static void main(String[] args){
        int a = 5;
        int b = 7;
 
        // Bitwise AND
        // 0101 & 0111 = 0101 = 5
        System.out.println("a&b = " + (a & b));
 
        // Bitwise OR
        // 0101 | 0111 = 0111 = 7
        System.out.println("a|b = " + (a | b));
 
        // Bitwise XOR
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));
 
        // Bitwise NOT
        // ~0101 = 1010
        // will give 2's complement of 1010 = -6
        System.out.println("~a = " + ~a);
    }
}

//Output

// a&b = 5
// a|b = 7
// a^b = 2
// ~a = -6