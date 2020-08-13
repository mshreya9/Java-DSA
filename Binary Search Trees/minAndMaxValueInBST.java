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
    public static int minValue(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }

    public static int maxValue(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
        root.left = node1;
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(6);
        root.right = node2;
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(3);
        node1.left = node3;
        node1.right = node4;
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(7);
        node2.left = node5;
        node2.right = node6;

        System.out.println(minValue(root));
        System.out.println(maxValue(root));
    }
}

//Output
// 1
// 7