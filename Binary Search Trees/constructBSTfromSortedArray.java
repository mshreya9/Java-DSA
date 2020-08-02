import java.util.*;

class BinaryTreeNode<T> {
    public BinaryTreeNode(T data){
        this.data = data;
    }
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;
}

class BinarySearchTree { 
    public static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr){
        return constructBST(arr, 0, arr.length-1);
    }

    public static BinaryTreeNode<Integer> constructBST(int[] arr, int sI, int eI) {
        //Base Case
        if(sI > eI){
            return null;
        }
        int mid = sI + (eI - sI)/2;
        BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(arr[mid]);
        temp.left = constructBST(arr, sI, mid-1);
        temp.right = constructBST(arr, mid+1, eI);
        System.out.print(temp.data + " ");
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        sortedArrayToBST(arr);
    }
}