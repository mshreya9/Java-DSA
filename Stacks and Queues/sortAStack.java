import java.util.*;

public class sortAStack {
    public static Stack<Integer> sort(Stack<Integer> s){
		//add code here.
		Stack<Integer> tmpSt = new Stack<>();
		while(!s.isEmpty()){
		    int temp = s.pop();
		    while(!tmpSt.isEmpty() && tmpSt.peek() > temp){
		        s.push(tmpSt.pop());
		    } 
		    
		    tmpSt.push(temp);
		}
		
		return tmpSt;
	}

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(34);
        st.push(3);
        st.push(31);
        st.push(98);
        st.push(92);
        st.push(23);

        System.out.println(sort(st));
    }
}

//Output: [3, 23, 31, 34, 92, 98]