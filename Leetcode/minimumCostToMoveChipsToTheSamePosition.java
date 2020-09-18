class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0, oddCount = 0;
        for(int i = 0; i < position.length; i++){
            if(position[i] % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        return Math.min(evenCount, oddCount);
    }
}