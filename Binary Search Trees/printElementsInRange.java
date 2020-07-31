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
    public static void printElementsInRange(BinaryTreeNode<Integer> root, int x, int y){
        if(root == null){
            return;
        }
        if(root.data <= y && root.data >= x){
            System.out.print(root.data + " ");
        }
        if(root.data >= x){
            printElementsInRange(root.left, x, y);
        }
        if(root.data <= y){
            printElementsInRange(root.right, x, y);
        }
        
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(40);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(20);
        root.left = node1;
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(60);
        root.right = node2;
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(30);
        node1.left = node3;
        node1.right = node4;
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(50);
        BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(70);
        node2.left = node5;
        node2.right = node6;

        printElementsInRange(root, 20, 50);        
    }
}

//Output:
//40 20 30 50 