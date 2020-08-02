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
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            return null;
        }
        if(root.data == data){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(root.data);
            return list;
        }
        else if(data < root.data){
            ArrayList<Integer> leftList = getPath(root.left, data);
            if(leftList != null){
                leftList.add(root.data);
            }
            return leftList;
        }
        else{
            ArrayList<Integer> rightList = getPath(root.right, data);
            if(rightList != null){
                rightList.add(root.data);
            }
            return rightList;
        }
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

        System.out.println(getPath(root, 5));
    }
}

//Output: [5, 6, 4]