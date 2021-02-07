class Solution {
    public int totalMoney(int n) {
        int sum = 0, var = 1, x = 1, count = 0;
        for(int i = 1; i <= n; i++){
            sum += var;
            var++;
            count++;
            if(count % 7 == 0){
                x++;
                var = x;
                count = 0;
            }
        }
        return sum;
    }
}