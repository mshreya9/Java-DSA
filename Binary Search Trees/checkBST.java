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
    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root == null){ 
            return true;
        }
        int rightmin = minimum(root.right);
        int leftmax = maximum(root.left);

        if(root.data <= leftmax){
            return false;
        }

        if(root.data > rightmin){
            return false;
        }

        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);

        if(isLeftBST && isRightBST){
            return true;
        }
        else{
            return false;
        }
    }

    public static int minimum(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MAX_VALUE; //positive infinity(largest number avl)
        }
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }

    public static int maximum(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(3);
        root.left = node1;
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(6);
        root.right = node2;
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(5);
        node1.left = node3;
        node1.right = node4;
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(7);
        node2.left = node5;
        node2.right = node6;

        System.out.println(isBST(root));
    }
}

//Output: false