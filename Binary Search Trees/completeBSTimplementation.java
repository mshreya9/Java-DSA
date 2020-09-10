class BST{
    private class Node {
        int data;
        Node left;
        Node right;
    }
    private Node root;

    public BST(int[] arr){
        this.root = construct(arr,0,arr.length-1);
    }
    private Node construct(int[] arr, int lo, int hi){
        //Base condition
        if(lo > hi){
            return null;
        }
        int mid = (lo + hi)/2;
        //create a new node
        Node n = new Node();
        n.data = arr[mid];
        n.left = construct(arr, lo, mid-1);
        n.right = construct(arr, mid+1, hi);

        return n;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        //Base Condition
        if(node == null){
            return;
        }
        String str = "";
        //left subtree
        if(node.left == null){
            str += ".";
        }
        else{
            str += node.left.data;
        }
        str += "->" + node.data + "<-";
        //right subtree
        if(node.right == null){
            str += ".";
        }
        else{
            str += node.right.data;
        }
        System.out.println(str);

        //left call
        display(node.left);

        //right call
        display(node.right);
    }
    
    //Search in BST
    public boolean find(int item){
        return find(this.root, item);
    }

    private boolean find(Node node, int item){
        //Base condition
        if(node == null){
            return false;
        }

        if(item > node.data){
            return find(node.right, item);
        }
        else if(item < node.data){
            return find(node.left, item);
        }
        else{
            return true;
        }
    }

    //Find max in BST
    public int max(){
        return max(this.root);
    }
    private int max(Node node){
        if(node.right == null){
            return node.data;
        }
        return max(node.right);
    }
}

class TreeUse{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        BST bst = new BST(arr);
        bst.display();
        int item = 100;
        System.out.println(bst.find(item));
        System.out.println(bst.max());
    }
}

//Output
// 20->40<-60
// 10->20<-30
// .->10<-.
// .->30<-.
// 50->60<-70
// .->50<-.
// .->70<-.
//false
//70