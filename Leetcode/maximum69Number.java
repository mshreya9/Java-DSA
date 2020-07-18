class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '6'){
                sb.replace(i,i+1, "9");
                break;
            }
        }
        String s = sb.toString();
        int n = Integer.parseInt(s);
        return n;
    }
}