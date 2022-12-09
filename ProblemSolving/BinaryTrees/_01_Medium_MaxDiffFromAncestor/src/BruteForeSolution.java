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
    private int maxDiff = 0;
    public int maxAncestorDiff(TreeNode root) {
        findMaxDiff(root);
        return maxDiff;
    }
    public void findNodeDiffEveryChild(TreeNode root,TreeNode child){

        if(root==null || child == null) return;
        maxDiff = Math.max(maxDiff , Math.abs(root.val- child.val));
        findNodeDiffEveryChild(root,child.left);
        findNodeDiffEveryChild(root,child.right);

    }

    public void findMaxDiff(TreeNode root){
        if(root==null) return;
        // node diffrence with every child
        findNodeDiffEveryChild(root,root.left);
        findNodeDiffEveryChild(root,root.right);

        // Lead node 
        findMaxDiff(root.left);
        findMaxDiff(root.right);
    }
}