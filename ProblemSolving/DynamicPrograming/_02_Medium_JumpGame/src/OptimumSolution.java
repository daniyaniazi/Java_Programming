class Solution {

    public boolean canJump(int[] nums) {
        int n= nums.length;
        int max = nums[0];

        for(int i=1 ; i<n;  i++){

            if(i>max) return false;

            max = Math.max(max , nums[i]+i);

        }

        return true;
    }

}