import java.util.*;

class StackUsingArray {
    private int data[];
    private int top;

    public StackUsingArray(){
        data = new int[10];
        top = -1;
    }

    public boolean isEmpty(){
        // if(top == -1){
        //     return true;
        // }
        // return false;
        return (top == -1);
    }

    public int size(){
        return top+1;
    }

    public int top() throws StackEmptyException{
        if(size() == 0){
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return data[top];
    }

    public void push(int elem) throws StackFullException{
        if(size() == data.length){
            //StackFullException
            StackFullException e = new StackFullException();
            throw e;
        }
        top++;
        data[top] = elem;
    }

    public int pop() throws StackEmptyException{
        if(size() == 0){
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
       int temp = data[top];
       top--;
       return temp;
    }
}

class StackEmptyException extends Exception{
    private static final long serialVersionUID = 1L;
}

class StackFullException extends Exception{}

class StackUse{
    public static void main(String[] args) throws StackFullException{
        StackUsingArray stack = new StackUsingArray();
        for(int i = 1; i <= 5; i++){
            stack.push(i);
        }

        while(!stack.isEmpty()){
            try {
                System.out.println(stack.pop());
            } catch (Exception e) {
                //Never reach here
            }
        }
    }
}

//Output 5
    //   4
    //   3
    //   2
    //   1