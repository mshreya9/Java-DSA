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

    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        int rootData;
        System.out.println("Enter root data");
        rootData = sc.nextInt();
        if(rootData == -1){
            return null;
        }
        //If rootData is not null then create root object
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }

    public static void main(String[] args) {
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        // BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
        // root.left = node1;
        // BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
        // root.right = node1;
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc);
        printTree(root);
        sc.close();
    }
}

//Taking input is not easy hence take input in Level order
//Output:
// 1 L:2,R:3
// 2 L:4,R:5
// 4
// 5
// 3 R:6
// 6