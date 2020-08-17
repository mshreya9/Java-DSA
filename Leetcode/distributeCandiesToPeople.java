class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int temp = 1, k = 0;
        while(candies > 0){
            if(temp < candies){
                arr[k] += temp;
                candies = candies - temp;
                temp++;
                k++;
                k = k % num_people;
            }
            else{
                arr[k] += candies;
                candies = 0;
            }
        }
        return arr;
    }
}