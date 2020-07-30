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
    public static BinaryTreeNode<Integer> buildTreeHelper(int in[], int pre[], int inS, int inE, int preS, int preE){
        if(inS > inE){
            return null;
        }
        int rootData = pre[preS]; //imp
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        int rootInIndex = -1;
        for(int i = inS; i <= inE; i++){
            if(in[i] == rootData){
                rootInIndex = -1;
                break;
            }
        }
        if(rootInIndex == -1){
            return null;
        }

        int leftInS = 0;
        int leftInE = rootInIndex - 1;
        int leftPreS = preS + 1;
        int leftPreE = leftInE - leftInS + leftPreS;

        int rightInS = rootInIndex + 1;
        int rightInE = inE;
        int rightPreS = leftPreE + 1;
        int rightPreE = preE;

        root.left = buildTreeHelper(in, pre, leftInS, leftInE, leftPreS, leftPreE);
        root.right = buildTreeHelper(in, pre, rightInS, rightInE, rightPreS, rightPreE);

        return root;
    }
    
	public static BinaryTreeNode<Integer> buildTree(int in[], int pre[]){
        return buildTreeHelper(in, pre, 0, in.length - 1, 0, pre.length - 1);
    }

    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null){ 
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
        BinaryTreeNode<Integer> rootValue = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
        rootValue.left = node1;
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
        rootValue.right = node2;
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(5);
        node1.left = node3;
        node1.right = node4;
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(7);
        node2.left = node5;
        node2.right = node6;
        
        int[] in = {4,2,5,1,6,3,7};
        int[] pre = {1,2,4,5,3,6,7};
        BinaryTreeNode<Integer> root = buildTree(in, pre);
        printTree(rootValue);
    }
}
