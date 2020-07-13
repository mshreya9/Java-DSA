class Solution {
    public String removeDuplicates(String S) {
        //Stack
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        
        if(S.length() == 1)
            return S;
        
        st.push(S.charAt(0));
        for(int i = 1; i < S.length(); i++){
            if(!st.isEmpty()){
                if(st.peek() == S.charAt(i)){
                    st.pop();
                } else {
                    st.push(S.charAt(i));
                }
            }
            else{
                st.push(S.charAt(i));
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        
        return sb.toString();
    }
}