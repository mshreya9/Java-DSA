//The key to this problem is that it repeats itself after 14 days, so Day 1, Day 15, Day 29.... are the same.
//Line 7 to line 9 is the most important part of the code.

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int arr[] = new int[8];
        int n = N % 14 ; 
        if (n == 0)
            n = 14;
        
        while(n-- > 0){
            for(int i = 1; i < 7; i++){
                if(cells[0] == 1 || cells[7] == 1){
                    arr[0] = 0;
                    arr[7] = 0;
                }
                if((cells[i-1] == 1 && cells[i+1] == 1) || (cells[i-1] == 0 && cells[i+1] == 0)){
                    arr[i] = 1;
                }
                else{
                    arr[i] = 0;
                }
            }
            System.arraycopy(arr, 0, cells, 0, 8);
            //System.out.println(Arrays.toString(cells));
        }
        return cells;
    }
}