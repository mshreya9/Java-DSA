class Solution {
    public String generateTheString(int n) {
        char[] str = new char[n];
        Arrays.fill(str, 'x');
        if((n & 1) == 0) {
            str[0] = 'y';
        }
        return new String(str);
    }
}