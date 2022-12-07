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
//https://leetcode.com/problems/range-sum-of-bst/submissions/
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return   getSUM( root,  low,  high,0);
    }
    public int getSUM(TreeNode root, int low, int high,int sum){
        if(root == null) return sum;

        if(root.val >= low && root.val <= high){
            sum += root.val;
        }
        if(root.val > low ){
            sum =  getSUM(root.left,low,high,sum);
        }
        if(root.val < high ){
            sum =  getSUM(root.right,low,high,sum);
        }
        return sum;

    }
}