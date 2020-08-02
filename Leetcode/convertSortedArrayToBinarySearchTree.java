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
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructBST(nums, 0, nums.length-1);
    }
    public TreeNode constructBST(int[] arr, int sI, int eI){
        if(sI > eI){
            return null;
        }
        int mid = sI + (eI - sI) / 2; 
        TreeNode temp = new TreeNode(arr[mid]);
        temp.left = constructBST(arr, sI, mid-1);
        temp.right = constructBST(arr, mid+1, eI);
        return temp;
    }
}