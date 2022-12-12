class Solution {
      public int climbStairs(int n) {
        int steps = countSteps(n);
          return steps;
    }

   public int countSteps(int n){
       if(n<0) return 0;
       if(n==0) return 1; // Found 1 path

       int step1 = countSteps(n-1) ;// go one step down
        int step2= countSteps(n-2) ; // go two steps down
       return step1+step2;
   }

}