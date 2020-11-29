class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int fivePercent = n / 20;
        double sum = 0;
        for(int i = fivePercent; i < arr.length-fivePercent; i++){
            sum += arr[i];
        }
        return sum / (arr.length - (2*fivePercent));
    }
}