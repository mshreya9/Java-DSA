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
    public boolean hasPathSum(TreeNode root, int sum) {
        Set<Integer> set = new HashSet<>();
        dfs(root, set, 0);
        if(set.contains(sum)){
            return true;
        }
        return false;
    }
    
    public void dfs(TreeNode root, Set<Integer> set, int currSum){
        if(root == null){
            return;
        }

        currSum += root.val;
        if(root.left == null && root.right == null){
            set.add(currSum);
        }

        dfs(root.left, set, currSum);
        dfs(root.right, set, currSum);
    }
}