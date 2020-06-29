import java.util.*;

class Solution {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(midDel(stack, 5));
    }

    static Stack<Integer> midDel(Stack<Integer> s, int size) {
        if(s.size() == 0){
            return s;
        }
        int k = size/2 + 1;
        solve(s, k);
        return s;
    }

    static void solve(Stack<Integer> s, int k) {
        if(k == 1){
            s.pop();
            return;
        }
        int temp = s.peek();
        s.pop();
        solve(s, k-1);
        s.push(temp);
        return;
    }
}