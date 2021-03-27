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
    public int findSecondMinimumValue(TreeNode root) {
         //Base Case
        if(root == null){
            return -1;
        }
        
        Set<Integer> set = preorderTraversal(root);
        Integer[] arr = new Integer[set.size()];
        set.toArray(arr);
        Arrays.sort(arr);
        if(arr.length >= 2){
            return arr[1];
        }
        return -1;
    }
    
    //Preorder  
    public void preorder(TreeNode node, Set<Integer> set) {
        if(node == null){
            return;
        }
        set.add(node.val);
        preorder(node.left, set);
        preorder(node.right, set);
    }
    
    //Adding val to set
    public Set<Integer> preorderTraversal(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        preorder(root, set);
        return set;
    }
}