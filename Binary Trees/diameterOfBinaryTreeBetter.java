import java.util.*;

class BinaryTreeNode<T> {
    public BinaryTreeNode(T data){
        this.data = data;
    }
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;
}

class Pair<T, V> {
    public T first;
    public V second;
}

class BinaryTreeUse {
    public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root){
        if(root == null){
            Pair<Integer, Integer> output = new Pair<>();
            output.first = 0;
            output.second = 0;
            return output;
        }

        Pair<Integer, Integer> lo = heightDiameter(root.left);
        Pair<Integer, Integer> ro = heightDiameter(root.right);
        int height = 1 + Math.max(lo.first, ro.first);
        int option1 = lo.first + ro.first;
        int option2 = lo.second;
        int option3 = ro.second;
        int diameter = Math.max(option1, Math.max(option2, option3));

        Pair<Integer, Integer> output = new Pair<>();
            output.first = height;
            output.second = diameter;
            return output;
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
        node3.left = node5;
        node2.right = node6;

        System.out.println("Height: " + heightDiameter(root).first);
        System.out.println("Diameter: " + heightDiameter(root).second);
        
    }
}

//Output: Height: 4
//Output: Diameter: 5