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
    private List<Integer> order= new ArrayList();
    public List<Integer> preorderTraversal(TreeNode root) {
        findOrder(root);
        return order;
    }

    public void findOrder(TreeNode root) {
        if(root == null) return;
        order.add(root.val);
        findOrder(root.left);
        findOrder(root.right);
    }
}