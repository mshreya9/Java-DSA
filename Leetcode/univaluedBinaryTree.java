/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        preorder(root, set);
        if(set.size() > 1){
            return false;
        }
        return true;
    }
    
    //Preorder Traversal 
    public void preorder(TreeNode node, Set<Integer> set) {
        if(node == null){
            return;
        }
        set.add(node.val);
        preorder(node.left, set);
        preorder(node.right, set);
    }
}