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
//Another solution - really interesting trick:

class Solution {
    public int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        else if(num % 9 == 0){
            return 9;
        }
        else{
            return num % 9;
        }
    }
}
