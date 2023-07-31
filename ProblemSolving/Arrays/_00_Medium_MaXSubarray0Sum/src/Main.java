import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

public class KadaneSolution {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        HashMap<Integer,Integer> summ = new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if (sum==0){
                max = i+1;
            }
            else{
                if(summ.get(sum)!=null){
                    max= Math.max(max, i-summ.get(sum));
                }
                else{
                    summ.put(sum, i);
                }
            }
        }
        return max;
    }
}