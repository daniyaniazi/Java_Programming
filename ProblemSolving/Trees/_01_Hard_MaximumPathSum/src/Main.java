https://leetcode.com/problems/binary-tree-maximum-path-sum/
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
    int maxSum =  Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findMaxSum(root);
        return maxSum;
    }

    public int findMaxSum(TreeNode root) {
        if(root == null) return 0;
        int leftSum = findMaxSum(root.left);
        int rightSum = findMaxSum(root.right);

        int treeSum = root.val + leftSum +rightSum;
        int betterSum = Math.max(leftSum,rightSum)+ root.val;
        int rootSum = root.val;

        maxSum = Math.max(maxSum, Math.max(treeSum ,Math.max(betterSum , rootSum)));

        return Math.max(betterSum,rootSum);
    }
}