class Solution {
    public int bitwiseComplement(int N) {
        String binary = Integer.toBinaryString(N);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '0'){
                sb.append('1');
            } else{
                sb.append('0');
            }
        }
        String binaryString = sb.toString();
        int decimal = Integer.parseInt(binaryString,2);
        return decimal;
    }
}
