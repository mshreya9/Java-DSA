import java.util.*;

class Heap {
    ArrayList<Integer> data = new ArrayList<>();

    public void add(int item){
        data.add(item);
        upheapify(data.size() - 1);
    }

    private void upheapify(int ci){
        int pi = (ci - 1) / 2;
        if(data.get(ci) < data.get(pi)){
            swap(pi, ci);
            upheapify(pi);
        }
        
    }

    private void swap(int i, int j){
        int ith = data.get(i);
        int jth = data.get(j);

        data.set(i, jth);
        data.set(j, ith);
    }

    public void display(){
        System.out.println(data);
    }

    public int size(){
        return this.data.size();
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    //The element with highest priority will be remomved first always
    //That element would be at the 0th index (highest priority)
    public int remove(){
        swap(0, this.data.size()-1);
        int returnValue = this.data.remove(this.data.size()-1);
        downheapify(0);
        return returnValue;
    }

    private void downheapify(int pi){
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;

        int mini = pi;
        if(lci < this.data.size() && data.get(lci) < data.get(mini)){
            mini = lci;
        }
        if(rci < this.data.size() && data.get(rci) < data.get(mini)){
            mini = rci;
        }

        if(mini != pi){
            swap(mini, pi);
            downheapify(mini);
        }
    }

    //This function returns the highest priority element
    public int get(){
        return this.data.get(0);
    }
}

class HeapClient{
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(10);
        heap.display();
        heap.add(20);
        heap.display();
        heap.add(30);
        heap.display();
        heap.add(40);
        heap.display();
        heap.add(5);
        heap.display();
        heap.add(3);
        heap.display();

        System.out.println( heap.remove());
        heap.display();
        System.out.println( heap.remove());
        heap.display();
        System.out.println( heap.remove());
        heap.display();
    }
}

//Output:
// [10]
// [10, 20]
// [10, 20, 30]
// [10, 20, 30, 40]
// [5, 10, 30, 40, 20]
// [3, 10, 5, 40, 20, 30]
// 3
// [5, 10, 30, 40, 20]
// 5
// [10, 20, 30, 40]
// 10
// [20, 40, 30]

//Note: Elements will be removed priority wise in minHeap (smaller value will have higher priority).
//Hence, elements would be removed in ascending order.