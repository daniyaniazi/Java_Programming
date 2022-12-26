class Solution {
    public boolean canJump(int[] nums) {
        return solve(nums,nums.length,0);
    }

    public boolean solve(int[] nums,int n,int idx){
        if(idx == n-1) return true;

        if(idx >=n) return false;

        for(int i=1;i<=nums[idx];i++){
            if(solve(nums,n,idx+i)) return true;
        }

        return false;
    }
}