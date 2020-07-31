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
    public static boolean isBST(BinaryTreeNode<Integer> root,int min, int max){
        if(root == null){
            return true;
        }
        if(root.data < min || root.data > max){
            return false;
        }
        boolean isLeftOk = isBST(root.left, min, root.data);
        boolean isRightOk = isBST(root.right, root.data, max);

        return isLeftOk && isRightOk;
        
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

        System.out.println(isBST(root, 1, 7));
    }
}

//Output: true