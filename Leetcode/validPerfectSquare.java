//Given a positive integer num, write a function which returns True if num is a perfect square else False.
//Note: Do not use any built-in library function such as sqrt.

class Solution {
    public boolean isPerfectSquare(int num) {
        // if(Math.sqrt(num) == (int)Math.sqrt(num)){
        // return true;
        // }
        // return false;

        double sqrt = num / 2;
        double temp = 0;

        while (sqrt != temp) {
            temp = sqrt;
            sqrt = (num / temp + temp) / 2;
        }
        if (sqrt == (int) sqrt) {
            return true;
        }
        return false;
    }
}