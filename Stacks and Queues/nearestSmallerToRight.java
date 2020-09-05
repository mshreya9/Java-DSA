import java.util.*;
class Solution {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};

        List<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--){
            if(st.size() == 0){
                list.add(-1);
            }
            else if(st.size() > 0 && st.peek() < arr[i]){
                list.add(st.peek());
            }
            else if(st.size() > 0 && st.peek() >= arr[i]){
                while(st.size() > 0 && st.peek() >= arr[i]){
                    st.pop();
                }
                
                if(st.size() == 0){
                    list.add(-1);
                }
                else{
                    list.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        Collections.reverse(list);

        for(Integer i : list){
            System.out.print(i + " ");
        }
    }
}

//Output:
//-1 2 -1 -1