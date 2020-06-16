//Given a positive integer num, output its complement number. The complement strategy is to flip the bits of its binary representation.

class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        String str = sb.toString();
        int decimal = Integer.parseInt(str, 2);  
        return decimal;
    }
}