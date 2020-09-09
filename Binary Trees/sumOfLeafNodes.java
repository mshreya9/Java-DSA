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
    public static int sumLeaf(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return root.data;
        }
        int lsum = sumLeaf(root.left);
        int rsum = sumLeaf(root.right);
        return lsum + rsum;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(50);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(25);
        root.left = node1;
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(45);
        root.right = node2;
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(38);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(48);
        node1.left = node3;
        node1.right = node4;
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(85);
        BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(60);
        node2.left = node5;
        node2.right = node6;
        BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(18);
        node4.left = node7;
        System.out.println(sumLeaf(root));
    }
}

//Output: 201