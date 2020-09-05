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
    
    private void inorder(TreeNode root, List<Integer> res) {
        if (root == null){
            return;
        }
        
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
        
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        inorder(root1, list1);
        inorder(root2, list2);
        
        return mergeList(list1, list2);
    }
    
    private List<Integer> mergeList(List<Integer> l1, List<Integer> l2) {
        int m = l1.size(), n = l2.size();
        int i = 0, j = 0;
        List<Integer> res = new ArrayList<>();
        
        while (i < m && j < n) {
            if (l1.get(i) < l2.get(j)) {
                res.add(l1.get(i));
                i++;
            } else {
                res.add(l2.get(j));
                j++;
            }
        }
        
        while (i < m) {
            res.add(l1.get(i));
            i++;
        }
        
        while (j < n) {
            res.add(l2.get(j));
            j++;
        }
        
        return res;
    }
}