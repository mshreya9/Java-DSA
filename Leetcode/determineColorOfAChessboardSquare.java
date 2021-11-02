class Solution {
    public boolean squareIsWhite(String coordinates) {
        //odd-odd: black
        //odd-even: white (odd: a,c,e,g and even: b,d,f,h)
        //even-even: black
        
        char c = coordinates.charAt(0);
        int d = coordinates.charAt(1);
        
        if(((c == 'a' || c == 'c' || c == 'e' || c == 'g') && (d % 2 == 0)) || ((c == 'b' || c == 'd' || c == 'f' || c == 'h') && (d % 2 != 0))){
            return true;
        }
        return false;
    }
}