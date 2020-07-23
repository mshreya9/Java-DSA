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
    public static int countLeafNodes(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.children.size() == 0){
            return 1;
        }

        int count = 0;
        for(int i = 0; i < root.children.size(); i++){
            count = count + countLeafNodes(root.children.get(i));
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

        System.out.println("The number of leaf nodes are: " + countLeafNodes(root)); 
    }
}

//The number of leaf nodes are: 3
