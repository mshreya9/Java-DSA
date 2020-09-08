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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Double> average = new ArrayList<>();
        
        if(root == null){
            return average;
        }
        
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int length = 0;
        while(!queue.isEmpty()) {
            length = queue.size();
            List<Integer> row = new ArrayList<>();
            while(length > 0) {
                TreeNode rm = queue.remove();
                row.add(rm.val);
                if(rm.left  != null){
                    queue.add(rm.left);
                }
                if(rm.right != null){
                    queue.add(rm.right);
                }
                length--;
            }
            list.add(row);
            double sum = 0;
            for(Integer i : row){
                sum += i;
            }
            average.add(sum/row.size());
        }
        return average;
    }
}