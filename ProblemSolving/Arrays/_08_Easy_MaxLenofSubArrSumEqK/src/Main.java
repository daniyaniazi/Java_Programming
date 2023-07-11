import java.util.HashMap;

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        
        long sum=0;
        int maxStreak=0;
        HashMap<Long,Integer> prevSumMap = new HashMap();
        for (int i=0;i<a.length;i++){
            
            sum+=a[i];
            if(sum==k){
                maxStreak = Math.max(maxStreak,i+1);
            }
            
            long prevKsum= sum-k;
            if(prevSumMap.get(prevKsum)!=null){
                int subArrLength = i - prevSumMap.get(prevKsum);
                maxStreak = Math.max(maxStreak,subArrLength);
            }
            if(prevSumMap.get(sum)!=null){
                continue;
            }else{
                prevSumMap.put(sum,i);
            }
        }
        
        return maxStreak;
    }
}


public class LongestSubArrayPositiveIn {
    public static int getLongestSubarray(int []nums, int k) {
        int j=0,i=0;
        int sum = nums[j];
        int maxLength=0;
        
        while(j<nums.length){
            while (i <= j && sum > k) {
                sum -= nums[i];
                i++;
            }
            
            if(sum==k){
                maxLength= Math.max(maxLength, j-i);
            }
            
            j++;
            if(j<nums.length) sum=sum+nums[j];
        }
        return maxLength;
    }
}