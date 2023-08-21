public class BruteForceSolution{
    public static int numberOfInversions(int []a, int n) {
        int count = 0;
        // Write your code here.
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    count++;
                }
            }
        }
        
        return count;
    }
}