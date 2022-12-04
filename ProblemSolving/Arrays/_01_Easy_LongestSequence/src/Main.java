// https://leetcode.com/problems/longest-consecutive-sequence/
import java.util.HashSet;

class Solution {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int maxStreak = 1;
        for (int num : nums) set.add(num);
        for (int num : nums) {
            // Begin Sequence
            if (!set.contains(num - 1)) {
                int currentStreak = 1;
                // Check if next sequence occur
                while (set.contains(num + 1)) {
                    num++;
                    currentStreak++;
                }
                maxStreak = Math.max(currentStreak, maxStreak);
            }
        }
        return maxStreak;
    }
}