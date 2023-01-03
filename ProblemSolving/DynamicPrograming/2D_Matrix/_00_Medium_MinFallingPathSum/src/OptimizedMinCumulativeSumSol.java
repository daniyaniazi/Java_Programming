class Solution {
    private int n;
    public int minFallingPathSum(int[][] matrix) {

        n= matrix.length;
        int[][] ans= new int[n][n];

        // populate first row
        for(int col=0;col<n;col++){
            ans[0][col] =  matrix[0][col];
        }

        for(int row=1;row<n;row++){
            for(int col=0;col<n;col++){

                int topLeft=Integer.MAX_VALUE;
                int topRight =Integer.MAX_VALUE;

                if(col-1>=0) topLeft = ans[row-1][col-1];
                if(col+1<n) topRight= ans[row-1][col+1];

                ans[row][col]=matrix[row][col] + Math.min(ans[row-1][col],Math.min(topLeft,topRight));
            }
        }
        // Min from last row
        int result = Integer.MAX_VALUE;
        for(int col=0;col<n;col++){
            result = Math.min(result, ans[n-1][col]);
        }
        return result;
    }


}