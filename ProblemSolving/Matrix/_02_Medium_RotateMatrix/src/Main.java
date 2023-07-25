public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class BruteForce {
    public void rotate(int[][] matrix) {
        int[][] rotateMatrix = new int [matrix.length][matrix[0].length]; // ON2
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                // ON2
                rotateMatrix[j][matrix.length-1-i]= matrix[i][j];
            }
        }
        
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]= rotateMatrix[i][j];
            }
        }
    }
}


class Optimal {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        //  Transpose The Matrix
        // N/2
        for(int i=0;i<n;i++){
            // N/2
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i] =  temp;
            }
        }
        
        //     Reverse Each Row
        // N
        for(int i=0;i<n;i++){
            // N/2
            for(int j=0;j<matrix[0].length/2;j++){
                int temp =  matrix[i][n-1-j];
                matrix[i][n-1-j]= matrix[i][j];
                matrix[i][j] =  temp;
            }
        }
    }
}