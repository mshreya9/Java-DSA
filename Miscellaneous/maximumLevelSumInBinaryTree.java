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

//Slight variation of Leetcode Problem -> Here we will return the maximum sum instead of the level

class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root == null){ 
            return 0;
        }
        int result = root.val;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int count = queue.size();
            int sum = 0;
            while(count-- > 0){
                TreeNode rm = queue.removeFirst();
                sum = sum + rm.val;
            
                if(rm.left != null){
                    queue.addLast(rm.left);
                }
                if(rm.right != null){
                    queue.addLast(rm.right);
                }
            }
            
            if(sum > result){
                result = sum;
            }
        }
        
        return result;
    }
}