class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftsum = 0;
        for (int x: nums) totalSum += x;
        for (int i = 0; i < nums.length; i++) {
            if(leftsum == totalSum - leftsum-nums[i]){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;

    }
}