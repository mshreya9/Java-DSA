//Leetcode 121 Best Time to Buy and Sell Stock

class Solution {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int ans = 0;
        if(prices.length == 0){
            System.out.println(ans);
        }
        int bought = prices[0];                                
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > bought){
                if(ans < (prices[i] - bought)){
                    ans = prices[i]-bought;
                }
            }
            else{
                bought = prices[i];
            }
        }
        System.out.println(ans);
    }
}

//Output
//5
