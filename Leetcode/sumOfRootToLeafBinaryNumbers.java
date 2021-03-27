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
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, "");
	    return sum;
    }

    public void dfs(TreeNode root, String curr) {
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            sum += Integer.parseInt(curr + root.val, 2);
        }
        
        dfs(root.left, curr + root.val);
        dfs(root.right, curr + root.val);    

    }
    
}