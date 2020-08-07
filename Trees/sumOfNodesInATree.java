import java.util.*;

class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}

class TreeUse {
    public static int sumNodes(TreeNode<Integer> root){
        if(root == null){ //Note: this is not a base case; it is an edge case
            return 0;
        }
        int sum = root.data;
        for(int i = 0; i < root.children.size(); i++){ //Base case got covered here
            sum += sumNodes(root.children.get(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(4);
        TreeNode<Integer> node1 = new TreeNode<Integer>(2);
        TreeNode<Integer> node2 = new TreeNode<Integer>(3);
        TreeNode<Integer> node3 = new TreeNode<Integer>(5);
        TreeNode<Integer> node4 = new TreeNode<Integer>(6);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        node2.children.add(node4);

        System.out.println("The sum of nodes in tree are: " + sumNodes(root)); 
    }
}