import java.util.*;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
        next = null;
    }
}

class StackusingLL<T> {
    private Node<T> head;
    private int size;

    public StackusingLL(){
        head = null;
        size = 0;
    }

    int size(){
        return size;
    }

    T top() throws StackEmptyException{
        if(size() == 0){
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return head.data;
    }

    boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    void push(T element){
        Node<T> newNode = new Node<T>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    T pop() throws StackEmptyException{
        if(size() == 0){
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp; 

    }
}

class StackEmptyException extends Exception{
    private static final long serialVersionUID = 1L;
}

class StackUse{
    public static void main(String[] args) throws StackEmptyException{
        StackusingLL<Integer> stack = new StackusingLL<>();
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

//Advantages : Generic type can be used
//No problem for doubling the capacity (no tension for size)
//There is no constraint on capacity
//It's efficient also 

//Output 5
    //   4
    //   3
    //   2
    //   1