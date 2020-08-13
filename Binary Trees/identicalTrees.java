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
    public static boolean isIdentical(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2)
	{
	    if(root1 == null && root2 == null){
	        return true;
	    }
	    if(root1 == null || root2 == null){
	        return false;
	    }
	    if(root1.data != root2.data){
	        return false;
	    }
        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
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

        //Tree 2
        BinaryTreeNode<Integer> root1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node11 = new BinaryTreeNode<>(2);
        root1.left = node11;
        BinaryTreeNode<Integer> node12 = new BinaryTreeNode<>(3);
        root1.right = node12;
        BinaryTreeNode<Integer> node13 = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> node14 = new BinaryTreeNode<>(5);
        node11.left = node13;
        node11.right = node14;
        BinaryTreeNode<Integer> node15 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> node16 = new BinaryTreeNode<>(8);
        node13.left = node15;
        node12.right = node16;
        
        System.out.println(isIdentical(root, root1));
    }
}

//Output : false