public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class BruteForce {
    public int missingNumber(int[] nums) {
        int[] freq =  new int[nums.length+1];
        Arrays.fill(freq,0);
        
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]=1;
        }
        int i=0;
        for(i=0;i<freq.length;i++){
            System.out.println(freq[i]);
            if(freq[i]==0) break;
            
        }
        return i;
    }
}
// Better with Hashtable
class Optimal {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int total=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return total-sum;
    }
}
class BestOptimal {
    public int missingNumber(int[] nums) {
        int xor1 = 0, xor2 = 0;
        
        for (int i = 0; i < nums.length; i++) {
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ (i);
        }
        
        xor2 = xor2 ^ nums.length;
        return (xor1 ^ xor2); // the missing number
    }
}