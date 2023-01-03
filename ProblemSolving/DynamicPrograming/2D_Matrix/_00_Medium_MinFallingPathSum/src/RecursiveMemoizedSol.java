class Solution {
    private int n;
    private int[][] mem= new int[101][101];

    public int minFallingPathSum(int[][] matrix) {
        for (int i = 0, len = mem.length; i < len; i++)  Arrays.fill(mem[i], -1);

        n= matrix.length;
        int row=0;
        int result = Integer.MAX_VALUE;
        for(int col=0;col<n;col++){
            result = Math.min( result,findMin(matrix,row,col));
        }
        return result;
    }

    public int findMin(int[][] matrix,int row, int col){

        if(row == n-1){ // last row
            return matrix[row][col];
        }
        if(mem[row][col]!=-1){
            return mem[row][col];
        }
        int minSum = Integer.MAX_VALUE;
        int currentSum = matrix[row][col];
        if(row+1<n&&col-1>=0)
            minSum = Math.min(minSum, currentSum + findMin(matrix,row+1,col-1));
        if(row+1<n)
            minSum = Math.min(minSum, currentSum + findMin(matrix,row+1,col));
        if(row+1<n&&col+1<n)
            minSum = Math.min(minSum, currentSum + findMin(matrix,row+1,col+1));
        mem[row][col]=minSum;
        return minSum;
    }
}