import java.util.*;

public class stockSpanProblem {
    public static List<Integer> stockSpan(int[] arr){
        Stack<Pair> st = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(st.size() == 0){
                list.add(-1);
            }
            else if(st.size() > 0 && st.peek().ngl > arr[i]){
                list.add(st.peek().index);
            }
            else if(st.size() > 0 && st.peek().ngl <= arr[i]){
                while(st.size() > 0 && st.peek().ngl <= arr[i]){
                    st.pop();
                }
                
                if(st.size() == 0){
                    list.add(-1);
                }
                else{
                    list.add(st.peek().index);
                }
            }
            st.push(new Pair(arr[i], i));
        }

        for(int i = 0; i < list.size(); i++){
            list.set(i, i-list.get(i));
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        System.out.println(stockSpan(arr));
    }
}

class Pair {
    int ngl;
    int index;

    public Pair(int ngl, int index){
        this.ngl = ngl;
        this.index = index;
    }
}

//Output:
// [1, 1, 1, 2, 1, 4, 6]