class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int right = cardPoints.length-1;
        int sum = 0;
        int max = 0;
        int left = k-1;
        for(int i = 0; i < k; i++){
            sum += cardPoints[i];
        }
        max = sum;
        for(int i = 0; i < k; i++){
            sum -= cardPoints[left--];
            sum += cardPoints[right--];
            max = Math.max(sum,max);
        }
        
        return max;
    }
}