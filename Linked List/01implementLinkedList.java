class LinkedList {
    private class Node{
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    //Size
    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    //Add Last O(1)
    public void addLast(int item){
        //create a new node
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        //attach
        if(this.size() >= 1){
            this.tail.next = nn;
        }

        //summary object update
        if(this.size == 0){
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            this.size++;
        }
    }

    //Add First O(1)
    public void addFirst(int item){
        //create a new node
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        //attach
        if(this.size() >= 1){
            nn.next = head;
        }

        //summary object update
        if(this.size == 0){
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.head = nn;
            this.size++;
        }
    }

    //Add At O(N)
    public void addAt(int item, int idx) throws Exception{
        if(idx < 0 || idx > this.size){
            throw new Exception("Invalid Index");
        }

        if(idx == 0){
            addFirst(item);
        } else if (idx == this.size){
            addLast(item);
        } else{
            //create a new node
            Node nn = new Node();
            nn.data = item;
            nn.next = null;

            //attach
            Node nm1 = getNodeAt(idx-1);
            Node np1 = nm1.next;
            nm1.next = nn;
            nn.next = np1;

            //summary update
            this.size++;
        }
    }

    //Get First O(1)
    public int getFirst() throws Exception {
        if(this.size == 0){
            throw new Exception("LL is empty");
        }
        return this.head.data;
    }

    //Get Last O(1)
    public int getLast() throws Exception {
        if(this.size == 0){
            throw new Exception("LL is empty");
        }
        return this.tail.data;
    }

    //Get At 
    public int getAt(int idx) throws Exception {
        if(this.size == 0){
            throw new Exception("LL is empty");
        }

        if(idx < 0 || idx >= this.size){
            throw new Exception("Invalid Index");
        }

        Node temp = this.head;
        for(int i = 1; i <= idx; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    //Get Node At O(N)
    //It is supposed to return the entire node
    private Node getNodeAt(int idx) throws Exception {
        if(this.size == 0){
            throw new Exception("LL is empty");
        }

        if(idx < 0 || idx >= this.size){
            throw new Exception("Invalid Index");
        }

        Node temp = this.head;
        for(int i = 1; i <= idx; i++){
            temp = temp.next;
        }
        return temp;
    }

    //Remove First O(1)
    public int removeFirst() throws Exception {
        if(this.size == 0){
            throw new Exception("LL is empty");
        }

        int rv = this.head.data;
        if(this.size == 1){
            this.head = null;
            this.head = null;
            this.size = 0;
        } else {
            this.head = this.head.next;
            this.size--;
        }

        return rv;
    }

    //Remove Last O(N)
    public int removeLast() throws Exception {
        if(this.size == 0){
            throw new Exception("LL is empty");
        }

        int rv = this.tail.data;
        if(this.size == 1){
            this.head = null;
            this.head = null;
            this.size = 0;
        } else {
            Node sizem2 = getNodeAt(this.size-2);
            this.tail = sizem2;
            this.tail.next = null;
            size--;
        }

        return rv;
    }

    //Remove At O(N)
    public int removeAt(int idx) throws Exception {
        if(idx < 0 || idx >= this.size){
            throw new Exception("Invalid Index");
        }

        if(this.size == 0){
            throw new Exception("LL is empty");
        }

        if(idx == 0){
            return removeFirst();
        } else if (idx == this.size-1){
            return removeLast();
        } else {
            Node nm1 = getNodeAt(idx-1);
            Node n = nm1.next;
            Node np1 = n.next;

            nm1.next = np1;
            this.size--;

            return n.data;
        }
    }

    //Display O(N)
    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.display();
    }
}

//Output
//2 1 3 4