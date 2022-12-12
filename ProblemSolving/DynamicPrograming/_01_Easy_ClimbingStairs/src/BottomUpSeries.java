class Solution {

    public int climbStairs(int n) {
        int[] ans = new int[n+1];
        if(n==1||n==2) return n;

        ans[0]=0;
        ans[1]=1;
        ans[2]=2;

        for(int i=3 ; i< ans.length ;i++){
            ans[i] = ans[i-1]+ans[i-2];
        }

        return ans[n];

    }

}