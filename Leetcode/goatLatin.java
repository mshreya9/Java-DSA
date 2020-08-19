class Solution {
    public String toGoatLatin(String S) {
        //Split the string into array of words
        String[] arr = S.split(" ");
        String[] str = new String[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            StringBuilder sb = new StringBuilder();
            String res = "a";
            //To add "a" (res) i+1 times after "ma"
            String repeat = res.repeat(i+1);
            
            if(arr[i].charAt(0) == 'a' || arr[i].charAt(0) == 'e' || arr[i].charAt(0) == 'i' || arr[i].charAt(0) == 'o' || arr[i].charAt(0) == 'u' || arr[i].charAt(0) == 'A' || arr[i].charAt(0) == 'E' || arr[i].charAt(0) == 'I' || arr[i].charAt(0) == 'O' || arr[i].charAt(0) == 'U' ) {
                
                sb.append(arr[i]);
                sb.append("ma");
                sb.append(repeat);
                str[i] = sb.toString();
            }
            else{
                char ch = arr[i].charAt(0);
                //remove the first character from string
                String cut = arr[i].substring(1, arr[i].length());
                StringBuilder sb1 = new StringBuilder();
                sb1.append(cut);
                sb1.append(ch);
                sb1.append("ma");
                sb1.append(repeat);
                str[i] = sb1.toString();
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < str.length; i++){
            ans.append(str[i]);
            if(i == str.length-1){
                break;
            }
            ans.append(" ");
        }
        return ans.toString();
    }
}