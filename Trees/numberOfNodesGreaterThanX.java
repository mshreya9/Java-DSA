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
    public static int greaterNodes(TreeNode<Integer> root, int x){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int count = 0;
        if(root.data > x){
            count++;
        }
        for(int i = 0; i < root.children.size(); i++){
            count += greaterNodes(root.children.get(i), x);
        }
        return count;
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

        int x = 2;
        System.out.println("The number of nodes greater than " + x +  " are: " + greaterNodes(root, x)); 
    }
}