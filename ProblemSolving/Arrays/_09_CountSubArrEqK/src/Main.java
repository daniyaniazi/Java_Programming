public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int maxStreak=0;
        for (int i=0;i<nums.length;i++){
            for (int j=i;j<nums.length;j++){
                sum =0;
                for (int l=i;l<=j;l++){
                    sum = sum+nums[l];
                }
                if (sum==k) maxStreak++;
            }
        }
        
        return maxStreak;
    }
}

class PrefSUMSolution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int maxStreak=0;
        HashMap<Integer,Integer> prevSumMap = new HashMap();
        prevSumMap.put(0,1);
        for (int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            int prevKsum= sum-k;
            if(prevSumMap.get(prevKsum)!=null){
                maxStreak+=prevSumMap.get(prevKsum);
            }
            if(prevSumMap.get(sum)!=null){
                prevSumMap.put(sum,prevSumMap.get(sum)+1);
            }else{
                prevSumMap.put(sum,1);
            }
        }
        
        return maxStreak;
    }
}