public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// O(N3)
class BruteForce {
    public void setZeroes(int[][] matrix) {
        // (N*M)*(N+N)+(N*M)
        for(int row=0;row<matrix.length;row++){
            for(int col = 0 ; col<matrix[row].length;col++){
                // M*N
                if(matrix[row][col]==0){
                    // N+N
                    setRows(matrix , row);
                    setCols(matrix,col);
                }
            }
        }
        
        for(int row=0;row<matrix.length;row++){
            for(int col = 0 ; col<matrix[row].length;col++){
                // N*M
                if(matrix[row][col]==Integer.MAX_VALUE ){
                    matrix[row][col]=0;
                }
            }
        }
    }
    
    public void setRows(int[][] matrix , int rowNum){
        
        for(int i=0;i<matrix[rowNum].length;i++){
            if(matrix[rowNum][i]==0){
                continue;
            }
            else{
                matrix[rowNum][i]=Integer.MAX_VALUE;
            }
        }
    }
    
    public void setCols(int[][] matrix , int colNum){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][colNum]==0){
                continue;
            }
            else{
                matrix[i][colNum]=Integer.MAX_VALUE;
            }
        }
    }
}


class Better {
    public void setZeroes(int[][] matrix) {
        
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];
        for(int row=0;row<matrix.length;row++){
            for(int col = 0 ; col<matrix[row].length;col++){
                // M*N
                if(matrix[row][col]==0){
                    rows[row]=1;
                    cols[col]=1;
                }
            }
        }
        
        for(int row=0;row<matrix.length;row++){
            for(int col = 0 ; col<matrix[row].length;col++){
                // N*M
                if(rows[row]==1 || cols[col]==1 ){
                    matrix[row][col]=0;
                }
            }
        }
    }
    
}


class Optimal {
    public void setZeroes(int[][] matrix) {
        
        int col0=1;
        // row  -> matrix[0][j] - to mark jth columns
        // col --> matrix[i][0] - to mark ith row
        for(int row=0;row<matrix.length;row++){
            for(int col = 0 ; col<matrix[row].length;col++){
                // M*N
                if(matrix[row][col]==0){
                    matrix[row][0] = 0; // mark Oth column to make ith row zero
                    if(col!=0)
                    {
                        matrix[0][col] = 0 ; // mark 0th row at column jth to make column J zero
                    }
                    else{
                        col0=0;
                    }
                    
                }
            }
        }
        
        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    // check for col & row:
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j]= 0;
                    }
                }
            }
        }
        
        //step 3: Finally mark the 1st col & then 1st row:
        if (matrix[0][0] == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j]= 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        
    }
    
}