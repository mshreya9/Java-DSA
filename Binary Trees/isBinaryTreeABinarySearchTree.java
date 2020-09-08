import java.util.*;

class BinaryTreeNode<T> {
    public BinaryTreeNode(T data){
        this.data = data;
    }
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;
}

class BinaryTreeUse {
    public static boolean isBST(BinaryTreeNode<Integer> root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.data > max || root.data < min){
            return false;
        }
        else if(! isBST(root.left, min, root.data)){
            return false;
        }
        else if(! isBST(root.right, root.data, max)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(50);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(25);
        root.left = node1;
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(75);
        root.right = node2;
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(12);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(37);
        node1.left = node3;
        node1.right = node4;
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(62);
        BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(87);
        node2.left = node5;
        node2.right = node6;
        System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}

//Output: true