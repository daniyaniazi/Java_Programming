class Solution {
    int[] ans = new int[46];
    public int climbStairs(int n) {
        int steps = countSteps(n);
        return steps;
    }

    public int countSteps(int n){
        if(n<0) return 0;
        if(ans[n] != 0) return ans[n];
        if(n==0) return 1; // Found 1 path

        int step1 = countSteps(n-1) ;// go one step down
        int step2= countSteps(n-2) ; // go two steps down
        return ans[n]= step1+step2;
    }

}