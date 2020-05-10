import java.util.*;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
        next = null;
    }
}

public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;

    QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }
    //Even if we do not make this constructor, by default it would have been the same.

    int size(){
        return size;
    }
    boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    T front() throws QueueEmptyException{
        if(size == 0){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        return front.data;
    }
    void enqueue(T elem){
        Node<T> newNode = new Node<T>(elem);
        if(size == 0){
            //Initially front and rear both were null
            //So, bring them to point to the newNode
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    T dequeue() throws QueueEmptyException{
        if(size == 0){
            //QueueEmptyException
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        T temp = front.data;
        front = front.next;
         //Removing the last element, be cautious!
         //Rear needs to be updated
         if(size == 1){
            rear = null;
        }
        size--;
        return temp;
    }
}

class QueueEmptyException extends Exception{
    private static final long serialVersionUID = 1L;
    
}

class QueueUse {
    public static void main(String[] args){
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        for(int i = 1; i <= 5; i++){
            queue.enqueue(i);
        }
        while(! queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
        }
    }
}