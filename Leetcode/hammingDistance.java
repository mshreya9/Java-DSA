class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int xor = x ^ y;
        String s = Integer.toBinaryString(xor);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}