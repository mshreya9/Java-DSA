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
    public static BinaryTreeNode<Integer> lca(BinaryTreeNode<Integer> root, int n1, int n2){
        if(root == null){
            return null;
		}
 
        //if nodes n1, n2 matches with root, directly return root 
        if (root.data == n1 || root.data == n2){
            return root;
        }
 
        BinaryTreeNode<Integer> llca = lca(root.left, n1, n2);
        BinaryTreeNode<Integer> rlca = lca(root.right, n1, n2);
 
        //one of n1,n2 is in left subtree and other is in right subtree
        //hence return that node becuase it is LCA
        if(llca != null && rlca != null){
            return root;
        }
 
        // if left subtree or right subtree is LCA
        return (llca != null) ? llca : rlca;
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
        node2.left = node5;
        node2.right = node6;
        System.out.println(lca(root,4,5).data);
        System.out.println(lca(root,4,6).data);
        System.out.println(lca(root,3,4).data);
        System.out.println(lca(root,2,4).data);
    }
}

//Output: 
// 2
// 1
// 1
// 2