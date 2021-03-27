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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int plo = 0, ilo = 0;
        int phi = preorder.length-1;
        int ihi = inorder.length-1;
        return construct(preorder, plo, phi, inorder, ilo, ihi);
    }
    
    public TreeNode construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi){
        //Base Case
        if(ilo > ihi || plo > phi){
            return null;
        }
        
        //Create a new node with plo
        TreeNode nn = new TreeNode();
        nn.val = pre[plo];
        
        //Search for pre[plo] in inorder
        int si = -1;
        int nel = 0;
        for(int i = ilo; i <= ihi; i++){
            if(pre[plo] == in[i]){
                si = i;
                break;
            }
            nel++;
        }
        
        //left and right child call
        nn.left = construct(pre, plo+1, plo+nel, in, ilo, si-1);
        nn.right = construct(pre, plo+nel+1, phi, in, si+1, ihi);
        
        return nn;
    }
}