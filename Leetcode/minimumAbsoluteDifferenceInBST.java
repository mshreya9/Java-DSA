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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderList(root, list);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < list.size()-1; i++) {
            ans = Math.min(ans, list.get(i+1)-list.get(i));
        }
        return ans;
    }
    
    //inorder - array list 
    public void inorderList(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }
        inorderList(root.left, list);
        list.add(root.val);
        inorderList(root.right, list);
    }
}