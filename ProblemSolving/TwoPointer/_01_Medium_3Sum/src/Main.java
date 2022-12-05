https://leetcode.com/problems/3sum/submissions/
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new LinkedList<>();

        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int low = i+1;
            int high = nums.length-1;
            int expectedSum = -nums[i];

            while(low<high)
            {
                if(nums[low]+nums[high] ==  expectedSum){
                    res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    while(low<high && nums[low]==nums[low+1]) low++;
                    while(low<high && nums[high]==nums[high-1]) high--;
                    low++;
                    high--;
                }
                else if(nums[low]+nums[high]<expectedSum) low++;
                else high--;

            }

        }
        return res;
    }
}