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
    public static int countLeafNodes(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int count = 1;
        if(root.left == null && root.right == null){
            return count;
        }
        int lc = countLeafNodes(root.left);
        int rc = countLeafNodes(root.right);
        return lc + rc;
    }
    
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
        root.left = node1;
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
        root.right = node2;
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(5);
        node1.left = node3;
        node1.right = node4;
        System.out.println(countLeafNodes(root));
    }
}

//Output: 5