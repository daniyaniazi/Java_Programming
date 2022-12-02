/*
* @notice Problem Link :  https://leetcode.com/problems/contains-duplicate/
 * */
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numCount = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
            if(numCount.contains(nums[i])) return true;
            numCount.add(nums[i]);
        }
        return false;
    }
}