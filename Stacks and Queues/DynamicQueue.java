import java.util.Queue;

class QueueUsingArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(){
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
        // return size == 0;
    }

    int front() throws QueueEmptyException{
        if(size == 0){
            //QueueEmptyException
            throw new QueueEmptyException();
        }
        return data[front];
    }

    void enqueue(int elem) throws QueueFullException{
        if(size == data.length){
            //QueueFullException
            doubleCapacity();
        }
        if(size == 0){  //Inserting the first element, hence front = 0
            front = 0;
        }
        size++;
        rear = (rear + 1) % data.length; //means the same as below 3 lines
        // rear++;
        // if(rear == data.length){  //We made our queue circular. We are dealing with the elements in a cicular way
        //     rear = 0;
        // }
        data[rear] = elem;
    }

    private void doubleCapacity(){
        //don't copy blindly the elements
        //we need to copy them acc to their insertion order
        int temp[] = data;
        data = new int[2*temp.length];
        int index = 0;
        for(int i = front; i < temp.length; i++){
            data[index] = temp[i];
            index++;
        }
        for(int i = 0; i <= front; i++){
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length-1;
    }

    int dequeue() throws QueueEmptyException {
        if(size == 0){
            //QueueEmptyException
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front = (front + 1) % data.length; //This means the same as below 3 lines
        //  front++;
        // if(front == data.length){
        //     front = 0;
        // }
        size--;

        if(size == 0){
            front = -1;
            rear = -1;
        }
        return temp;
    }
}

class QueueEmptyException extends Exception{
    private static final long serialVersionUID = 1L;
}

class QueueUse {
    public static void main(String[] args){
        QueueUsingArray queue = new QueueUsingArray(3);
        for(int i = 1; i <= 5; i++){
            try {
                queue.enqueue(i);
            } catch (QueueFullException e) {
                
            }
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

//Output
// 1
// 2
// 3
// 4
// 5

//Above implementation is a dynamic queue with double capacity