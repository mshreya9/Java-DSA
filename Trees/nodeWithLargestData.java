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
    public static int largest(TreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int max = root.data;
        for(int i = 0; i < root.children.size(); i++){
            int childLargest = largest(root.children.get(i));
            if(childLargest > max){
                max = childLargest;
            }
        }
        return max;
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

        System.out.println("The node with largest data is: " + largest(root)); 
    }
}