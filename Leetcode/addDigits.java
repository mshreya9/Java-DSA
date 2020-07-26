class Solution {
    public int addDigits(int num) {
        //base case
        if(num < 10){
            return num;
        }
        int x = num % 10;
        num = num / 10;
        return(addDigits(x + num));
    }
}