//Leetcode 122 Best Time to Buy and Sell Stock II

class Solution {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = 0;
        for(int i = 0; i < prices.length-1; i++){
            int j = i+1;
            if(prices[j] > prices[i]){               // to buy at lower price at ith position
                profit += prices[j] - prices[i]; 
            }   
        }
        System.out.println(profit);
    }
}

//Output
//7
