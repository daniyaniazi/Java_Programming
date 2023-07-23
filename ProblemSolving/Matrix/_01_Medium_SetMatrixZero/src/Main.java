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