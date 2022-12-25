class Solution {
    public boolean isValidBST(TreeNode root) {
        return  check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean check(TreeNode node,long lower, long upper){
        if (node==null) return true;
        if(node.val >= upper || node.val <= lower) return false;

        return check(node.left,lower,node.val) &&  check(node.right,node.val,upper);

    }
}