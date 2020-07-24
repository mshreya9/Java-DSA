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
    public static void preorder(TreeNode<Integer> root){
        if(root == null){ //We have to handle this otheriwse it would try to access data of null node and result in NullPointerException
            return; 
        }
        System.out.print(root.data + " ");
        for(int i = 0; i < root.children.size(); i++){
            preorder(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(4);
        TreeNode<Integer> node1 = new TreeNode<Integer>(2);
        TreeNode<Integer> node2 = new TreeNode<Integer>(3);
        TreeNode<Integer> node3 = new TreeNode<Integer>(5);
        TreeNode<Integer> node4 = new TreeNode<Integer>(6);
        TreeNode<Integer> node5 = new TreeNode<Integer>(9);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        node2.children.add(node4);
        node2.children.add(node5);

        preorder(root); 
    }
}

//Output: 4 2 3 6 9 5 