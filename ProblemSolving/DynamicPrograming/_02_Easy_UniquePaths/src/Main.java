import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class RecursionDPSolution {
    int[][] mem;
    public int uniquePaths(int m, int n) {
        mem = new int[m][n];
        for(int[] row : mem){
            Arrays.fill(row,-1);
        }
        return dp(0,0,m,n);
    }
    
    public int dp(int i , int j,int m, int n){
        if(i<0||j<0|| i>=m || j>=n ){return 0;}
        
        if(mem[i][j]!=-1) return mem[i][j];
        
        if(i==m-1 && j==n-1) return 1;
        
        int right = dp(i,j+1,m,n);
        int left = dp(i+1,j,m,n);
        
        return mem[i][j] = right+left;
    }
}