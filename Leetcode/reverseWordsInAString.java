class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder op = new StringBuilder();
        for(int i = arr.length-1; i >= 0 ; i--){
            if (!arr[i].isEmpty()) {
                op.append(arr[i]);
                if(arr[i] == arr[0]){
                    break;
                }
                op.append(" ");
            }
        }
        String str = op.toString().trim();
        return str;
     }
}