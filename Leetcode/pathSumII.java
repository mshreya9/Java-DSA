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
    List<List<Integer>> fin = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list, 0, targetSum);
        return fin;
    }
    
    public void dfs(TreeNode root, List<Integer> list, int currSum, int targetSum){
        if(root == null){
            return;
        }

        list.add(root.val);
        currSum += root.val;
        if(root.left == null && root.right == null){
            if(currSum == targetSum){
                fin.add(new ArrayList(list));
            }
            
            list.remove(list.size()-1);
            
            return;
        }

        dfs(root.left, list, currSum, targetSum);
        dfs(root.right, list, currSum, targetSum);
        list.remove(list.size()-1);
    }
}