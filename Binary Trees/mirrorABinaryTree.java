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
    public static void mirror(BinaryTreeNode<Integer> root){
        //Base Case
        if(root == null){
            return;
        }

        mirror(root.left);
        mirror(root.right);

        // int temp = root.left.data;
        // root.left.data = root.right.data;
        // root.right.data = temp;
        BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
    }
    
    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null){ //Base Case
            return;
        }
        String toBePrinted = root.data + " ";
        if(root.left != null){
            toBePrinted += "L:" + root.left.data + ",";
        }

        if(root.right != null){
            toBePrinted += "R:" + root.right.data;
        }
        System.out.println(toBePrinted);
        printTree(root.left);
        printTree(root.right);
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
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(7);
        node2.left = node5;
        node2.right = node6;
        mirror(root);
        printTree(root);
    }
}

