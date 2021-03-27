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
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        helper(root, list);
        
        TreeNode head = new TreeNode(-1);
        TreeNode dummy = head;
        for (TreeNode node : list){
            dummy.right = node;
            dummy = dummy.right;
            dummy.left = null;
        }
        return head.right;
    }
    
    public void helper(TreeNode node, List<TreeNode> list){
        if (node == null) return;
        helper(node.left, list);
        list.add(node);
        helper(node.right, list);
    }
}