class Solution {
    public boolean isPowerOfFour(int num) {
        //odd multiples of 2 are not power of 4
      
        if((num & (num-1)) == 0 && num > 0 && (num & 0x55555555) != 0){
            return true;
        }
        return false;
    }
}