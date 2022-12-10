class Solution {
    long totalSum=0;
    long maxProd = 0;

    public int maxProduct(TreeNode root) {
        totalSum = getTotalSum(root);
        findProduct(root);

        return (int)(maxProd % 1000000007);
    }

    public long getTotalSum(TreeNode root){
        if(root==null) return 0;
        long sum = root.val + getTotalSum(root.left)+getTotalSum(root.right);

        return sum;
    }

    public long findProduct(TreeNode root){
        if(root==null) return 0;
        long subTreeSum= findProduct(root.left) + findProduct(root.right) +  root.val ;
        long remainingSum = totalSum - subTreeSum;
        maxProd = Math.max(maxProd,remainingSum*subTreeSum);

        return subTreeSum;
    }
}
