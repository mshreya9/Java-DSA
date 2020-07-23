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
    public static void printAtK(TreeNode<Integer> root, int k){
        if(k < 0){
            return;
        }

        if(k == 0){
            System.out.println(root.data);
            return;
        }

        for(int i = 0; i < root.children.size(); i++){
            printAtK(root.children.get(i), k-1);
        }
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

        printAtK(root, 2); 
    }
}

//Output: 6 (In the above tree, only node with data as 6 is at depth 2)
//Imp: Height is of a tree
//Depth is of a node