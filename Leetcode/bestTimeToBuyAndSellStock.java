//Question
//Say you have an array prices for which the ith element is the price of a given stock on day i.
// Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
// Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length-1; i++){
            int j = i+1;
            if(prices[j] > prices[i]){               // to buy at lower price at ith position
                profit += prices[j] - prices[i]; 
            }   
       }
        return profit;
    }
}

//Another Solution
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        if(prices.length == 0){
            return ans;
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
     return ans;
    }
}