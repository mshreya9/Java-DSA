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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        paths(root, list, "");
        return list;
    }
    public void paths(TreeNode root, List<String> list, String curr){
        if(root == null){
            return;
        }
        
        curr += root.val;
        if(root.left == null && root.right == null){
            list.add(curr);
        }
        
        paths(root.left, list, curr + "->");
        paths(root.right, list, curr + "->");
    }
}