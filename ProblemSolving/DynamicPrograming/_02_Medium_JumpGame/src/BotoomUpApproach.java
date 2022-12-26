class Solution {

    public boolean canJump(int[] nums) {
        int n= nums.length;
        Boolean[] canReach = new Boolean[n];
        Arrays.fill(canReach,false);
        canReach[0]=true;
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(canReach[j]&& j+ nums[j] >= i ){
                    canReach[i]=true;
                    break;
                }
            }
        }

        return canReach[n-1];
    }

}