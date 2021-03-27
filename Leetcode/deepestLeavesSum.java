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
    public int deepestLeavesSum(TreeNode root) {
        int k = height(root);
        
        if(root == null){
            return 0;
        }
        
        fun(root, k);
        return sum;
    }
    
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        return Math.max(lh, rh) + 1;
    }
    
    public void fun(TreeNode root, int k){
        if(root == null){
            return;
        }
        
        if(k == 1){
            sum += root.val;
        }
        
        fun(root.left, k-1);
        fun(root.right, k-1);
    }
}