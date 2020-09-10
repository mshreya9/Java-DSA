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
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        BST bst = new BST(arr);
        bst.display();
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