public class OnSpaceSolution {
}
class Solution {
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