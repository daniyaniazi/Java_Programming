class Solution {
    public int [] arr = new int[10000];

    public boolean canJump(int[] nums) {
        Arrays.fill(arr,-1);
        return solve(nums,nums.length,0);
    }

    public boolean solve(int[] nums,int n,int idx){
        if(idx == n-1) return true;

        if(idx >=n) return false;

        if(arr[idx]!=-1){

            if (arr[idx]==0)return false;
            if (arr[idx]==1)return true;

        };

        for(int i=1;i<=nums[idx];i++){
            if(solve(nums,n,idx+i)){

                arr[idx]=1;
                return true;

            };
        }
        arr[idx]=0;
        return false;
    }
}