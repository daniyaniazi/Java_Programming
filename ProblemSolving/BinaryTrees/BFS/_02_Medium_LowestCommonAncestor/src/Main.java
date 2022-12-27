class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Queue<TreeNode> queue  = new LinkedList<>();
        queue.offer(root);
        TreeNode result = null;

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            if (p.val <= curr.val && q.val >= curr.val ||
                    p.val >= curr.val && q.val <= curr.val) {
                return curr;
            }

            if (p.val > curr.val && q.val > curr.val) {
                if (curr.left != null) queue.offer(curr.right);
            }

            if (p.val < curr.val && q.val < curr.val) {
                if (curr.right != null) queue.offer(curr.left);
            }
        }

        return null;
    }
}